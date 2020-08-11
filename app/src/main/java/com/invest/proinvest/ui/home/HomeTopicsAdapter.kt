package com.invest.proinvest.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.invest.proinvest.data.model.TopicData
import com.invest.proinvest.databinding.ItemTopicsBinding

class HomeTopicsAdapter(private val onTopicClicked: (TopicData) -> Unit) :
    RecyclerView.Adapter<HomeTopicsAdapter.HomeTopicsViewHolder>() {

    private val items = mutableListOf<TopicData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeTopicsViewHolder =
        HomeTopicsViewHolder(
            ItemTopicsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: HomeTopicsViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setTopics(topics: List<TopicData>) {
        items.clear()
        items.addAll(topics)
        notifyDataSetChanged()
    }

    inner class HomeTopicsViewHolder(
        private val binding: ItemTopicsBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onTopicClicked.invoke(items[adapterPosition])
            }
        }

        fun bind(topic: TopicData) {
            binding.apply {
                subjectTopic.text = topic.topicName
                subjectTopicCount.text = "5 Lessons"
                subjectTopicDescription.text = topic.topicDescription

                if (adapterPosition == itemCount) {
                    subjectView.isVisible = false
                }
            }
        }
    }
}
