package com.invest.proinvest.ui.lessons

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavDirections
import com.invest.proinvest.data.model.LessonData
import com.invest.proinvest.data.model.LessonDetails
import com.invest.proinvest.data.model.LessonDetailsData
import com.invest.proinvest.data.model.Lessons
import com.invest.proinvest.data.repository.LessonRepository
import com.invest.proinvest.view.Event
import kotlinx.coroutines.launch

class LessonViewModel(private val repository: LessonRepository) : ViewModel() {

    private val _uiState = MutableLiveData<LessonUIState>(LessonUIState.Loading)
    val uiState: LiveData<LessonUIState> = _uiState

    private val _interactions = MutableLiveData<Event<LessonActions>>()
    val interactions: LiveData<Event<LessonActions>> = _interactions

    private lateinit var topicID: String
    private lateinit var topicName: String
    private lateinit var lessonID: String
    private lateinit var lessonName: String

    fun setLesson(topicID: String, topicName: String) {
        this.topicID = topicID
        this.topicName = topicName
        viewModelScope.launch {
            val topics = if (repository.countLessons(topicID) == 0) {
                val lessonAdapter: Lessons by lazy {
                    Lessons { for (t in it.indices) { repository.insertLessons(it[t]) } }
                }

                lessonAdapter.lessonsData()

                repository.loadLessons(topicID)
            } else {
                repository.loadLessons(topicID)
            }

            _uiState.postValue(LessonUIState.Lesson(topics))
        }
    }

    fun setLessonDetails(lessonID: String, lessonName: String) {
        this.lessonName = lessonName
        viewModelScope.launch {
            val details = if (repository.countLessonDetails(topicID, lessonID) == 0) {
                val lessonAdapter: LessonDetails by lazy {
                    LessonDetails { for (t in it.indices) { repository.insertLessonDetails(it[t]) } }
                }

                lessonAdapter.lessonsDetailsData()

                repository.loadLessonDetails(topicID, lessonID)
            } else {
                repository.loadLessonDetails(topicID, lessonID)
            }

            _uiState.postValue(LessonUIState.LessonDetail(details, topicName, lessonName))
        }
    }

    sealed class LessonActions {
        data class Navigate(val destination: NavDirections) : LessonActions()
    }

    sealed class LessonUIState {

        object Loading : LessonUIState()

        data class Lesson(val lessons: List<LessonData>) : LessonUIState()

        data class LessonDetail(val lessonsDetails: LessonDetailsData, val topicName: String, val lessonName: String) : LessonUIState()

        data class Error(val message: String) : LessonUIState()
    }
}
