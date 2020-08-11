package com.invest.proinvest.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.invest.proinvest.R
import com.invest.proinvest.data.model.TopicData
import com.invest.proinvest.databinding.HomeFragmentBinding
import com.invest.proinvest.view.extension.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(R.layout.home_fragment) {

    private val viewModel: HomeViewModel by viewModel()

    private val binding by viewBinding(HomeFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
        setupAdapter()

        viewModel.uiState.observe(viewLifecycleOwner) {
            when (it) {
                HomeViewModel.HomeUIState.Loading -> {}
                is HomeViewModel.HomeUIState.Topics -> { setupTopics(it.topics) }
                is HomeViewModel.HomeUIState.Error -> {}
            }
        }

        viewModel.setTopics()
    }

    private fun setupToolbar() {
        binding.toolbarTitle.text = "Home"
    }

    private val homeTopicsAdapter: HomeTopicsAdapter by lazy {
        HomeTopicsAdapter { onTopicPicked(it) }
    }

    private fun onTopicPicked(topic: TopicData) {
        findNavController().navigate(HomeFragmentDirections.toLessonFragment(topic))
    }

    private fun setupTopics(topic: List<TopicData>) {
        homeTopicsAdapter.setTopics(topic)
    }

    private fun setupAdapter() {
        binding.topicsList.adapter = homeTopicsAdapter
    }
}
