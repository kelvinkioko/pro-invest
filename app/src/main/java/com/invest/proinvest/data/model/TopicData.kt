package com.invest.proinvest.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "topics")
data class TopicData(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "topic_id") var topicID: String,
    @ColumnInfo(name = "topic_name") var topicName: String,
    @ColumnInfo(name = "topic_description") var topicDescription: String
) : Parcelable

class Topics(val loadTopics: (List<TopicData>) -> (Unit)) {

    private var topics = mutableListOf<TopicData>()

    fun topicData() {
        val topicOneData = TopicData(
            0,
            "tpc-I",
            "Why Invest",
            "In this section you will learn about the benefits of investing and hou you should set yourself up financially to get the most from your investing life"
        )
        val topicTwoData = TopicData(
            0,
            "tpc-II",
            "The basics of investing",
            "In this section you will learn the basics of investing before you get started so that you can invest with confidence"
        )
        val topicThreeData = TopicData(
            0,
            "tpc-III",
            "Finding great opportunities",
            "Learn time tested techniques that will guide you to identify the greatest investment opportunities"
        )
        val topicFourData = TopicData(
            0,
            "tpc-IV",
            "Looking deeper",
            "Learn how to analyze companies from a financial point of view to enable you better understand the business and its long term prospects and opportunities"
        )
        val topicFiveData = TopicData(
            0,
            "tpc-V",
            "Your Investing journey",
            "Understand how to buy your first stock, how to build a diversified portfolio and know when to sell or lock in your profits"
        )
        val topicSixData = TopicData(
            0,
            "tpc-VI",
            "Getting started",
            "In this section you will learn how to set up your brokerage account, fund it and start buying stocks"
        )

        topics.clear()
        topics.addAll(listOf(topicOneData, topicTwoData, topicThreeData, topicFourData, topicFiveData, topicSixData))

        loadTopics(topics)
    }
}
