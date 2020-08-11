package com.invest.proinvest.ui.details

import android.app.Dialog
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.invest.proinvest.R
import com.invest.proinvest.data.model.LessonDetailsData
import com.invest.proinvest.databinding.LessonDetailsDialogFragmentBinding
import com.invest.proinvest.view.extension.viewBinding

class DetailsDialogFragment(val lessonsDetails: LessonDetailsData, val topic: String, val lesson: String) : BottomSheetDialogFragment() {

    private val binding by viewBinding(LessonDetailsDialogFragmentBinding::bind)

    /**
     * This function makes BottomSheetDialogFragment full screen and without collapsed state
     * For some reason this doesn't work without the params.height
     */
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener {
            val bottomSheet = dialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
            val params = bottomSheet.layoutParams
            params.height = (Resources.getSystem().displayMetrics.heightPixels)
            bottomSheet.layoutParams = params
            BottomSheetBehavior.from(bottomSheet).apply {
                state = BottomSheetBehavior.STATE_EXPANDED
                skipCollapsed = true
            }
        }
        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.lesson_details_dialog_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
        setupLessonsDetails()
    }

    private fun setupToolbar() {
        binding.toolbar.setNavigationOnClickListener { dismiss() }
    }

    private fun setupLessonsDetails() {
        binding.apply {
            lessonName.text = lesson
            topicName.text = topic
            details.text = resources.getString(lessonsDetails.lessonDetails)
        }
    }
}
