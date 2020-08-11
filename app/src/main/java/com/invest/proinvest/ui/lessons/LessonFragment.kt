package com.invest.proinvest.ui.lessons

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.invest.proinvest.R
import com.invest.proinvest.data.model.LessonData
import com.invest.proinvest.data.model.LessonDetailsData
import com.invest.proinvest.databinding.LessonFragmentBinding
import com.invest.proinvest.ui.details.DetailsDialogFragment
import com.invest.proinvest.view.extension.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LessonFragment : Fragment(R.layout.lesson_fragment) {

    private val viewModel: LessonViewModel by viewModel()

    private val binding by viewBinding(LessonFragmentBinding::bind)
    private val args: LessonFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
        setupAdapter()
        setupTitle()

        viewModel.uiState.observe(viewLifecycleOwner) {
            when (it) {
                LessonViewModel.LessonUIState.Loading -> {}
                is LessonViewModel.LessonUIState.Lesson -> { setupLessons(it.lessons) }
                is LessonViewModel.LessonUIState.LessonDetail -> { showDetails(it.lessonsDetails, it.topicName, it.lessonName) }
                is LessonViewModel.LessonUIState.Error -> {}
            }
        }

        viewModel.setLesson(topicID = args.topicData.topicID, topicName = args.topicData.topicName)
    }

    private fun setupToolbar() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
    }

    private val lessonsAdapter: LessonAdapter by lazy {
        LessonAdapter { onLessonPicked(it) }
    }

    private fun onLessonPicked(lesson: LessonData) {
        viewModel.setLessonDetails(lessonID = lesson.lessonID, lessonName = lesson.lessonName)
    }

    private fun setupLessons(lesson: List<LessonData>) {
        lessonsAdapter.setLesson(lesson)
    }

    private fun setupAdapter() {
        binding.lessonList.adapter = lessonsAdapter
    }

    private fun setupTitle() {
        binding.topicTextView.text = args.topicData.topicName
    }

    private fun showDetails(lessonDetailsData: LessonDetailsData, topicName: String, lessonName: String) {
        val bottomSheetFragment = DetailsDialogFragment(lessonsDetails = lessonDetailsData, topic = topicName, lesson = lessonName)
        bottomSheetFragment.show(parentFragmentManager, bottomSheetFragment.tag)
    }
}
