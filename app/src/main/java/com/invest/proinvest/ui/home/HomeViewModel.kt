package com.invest.proinvest.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavDirections
import com.invest.proinvest.data.model.TopicData
import com.invest.proinvest.data.model.Topics
import com.invest.proinvest.data.repository.TopicsRepository
import com.invest.proinvest.view.Event
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: TopicsRepository) : ViewModel() {

    private val _uiState = MutableLiveData<HomeUIState>(HomeUIState.Loading)
    val uiState: LiveData<HomeUIState> = _uiState

    private val _interactions = MutableLiveData<Event<HomeActions>>()
    val interactions: LiveData<Event<HomeActions>> = _interactions

    fun setTopics() {
        viewModelScope.launch {
            val topics = if (repository.countTopics() == 0) {
                val topicsAdapter: Topics by lazy {
                    Topics { for (t in it.indices) { repository.insertTopics(it[t]) } }
                }

                topicsAdapter.topicData()

                repository.loadTopics()
            } else {
                repository.loadTopics()
            }

            _uiState.postValue(HomeUIState.Topics(topics))
        }
    }

    sealed class HomeActions {
        data class Navigate(val destination: NavDirections) : HomeActions()
    }

    sealed class HomeUIState {

        object Loading : HomeUIState()

        data class Topics(val topics: List<TopicData>) : HomeUIState()

        data class Error(val message: String) : HomeUIState()
    }
}
