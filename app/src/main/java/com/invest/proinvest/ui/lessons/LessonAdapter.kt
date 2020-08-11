package com.invest.proinvest.ui.lessons

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.invest.proinvest.data.model.LessonData
import com.invest.proinvest.databinding.ItemLessonBinding

class LessonAdapter(private val onLessonClicked: (LessonData) -> Unit) :
    RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    private val items = mutableListOf<LessonData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder =
        LessonViewHolder(
            ItemLessonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setLesson(lesson: List<LessonData>) {
        items.clear()
        items.addAll(lesson)
        notifyDataSetChanged()
    }

    inner class LessonViewHolder(
        private val binding: ItemLessonBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onLessonClicked.invoke(items[adapterPosition])
            }
        }

        fun bind(lesson: LessonData) {
            binding.apply {
                lessonTopic.text = lesson.lessonName

                if (adapterPosition == itemCount - 1) {
                    lessonView.isVisible = false
                }
            }
        }
    }
}
