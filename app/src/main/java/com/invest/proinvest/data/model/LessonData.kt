package com.invest.proinvest.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "lessons")
data class LessonData(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "topic_id") var topicID: String,
    @ColumnInfo(name = "lesson_id") var lessonID: String,
    @ColumnInfo(name = "lesson_name") var lessonName: String
) : Parcelable

class Lessons(val loadLessons: (List<LessonData>) -> (Unit)) {

    private var lessons = mutableListOf<LessonData>()

    fun lessonsData() {
        val topicOneLessonOneData = LessonData(
            0,
            "tpc-I",
            "lvl-I",
            "How we can help you learn"
        )
        val topicOneLessonTwoData = LessonData(
            0,
            "tpc-I",
            "lvl-II",
            "Why invest in stocks"
        )
        val topicOneLessonThreeData = LessonData(
            0,
            "tpc-I",
            "lvl-III",
            "Financial goals"
        )
        val topicOneLessonFourData = LessonData(
            0,
            "tpc-I",
            "lvl-IV",
            "The power of compound interest"
        )
        val topicOneLessonFIveData = LessonData(
            0,
            "tpc-I",
            "lvl-V",
            "Paying yourself first"
        )
        val topicOneLessonSixData = LessonData(
            0,
            "tpc-I",
            "lvl-VI",
            "Necessary steps to saving"
        )
        val topicOneLessonSevenData = LessonData(
            0,
            "tpc-I",
            "lvl-VI",
            "Timeline"
        )

        val topicTwoLessonOneData = LessonData(
            0,
            "tpc-II",
            "lvl-I",
            "What is a stock?"
        )
        val topicTwoLessonTwoData = LessonData(
            0,
            "tpc-II",
            "lvl-II",
            "Ticker Symbols"
        )
        val topicTwoLessonThreeData = LessonData(
            0,
            "tpc-II",
            "lvl-III",
            "Public offerings"
        )
        val topicTwoLessonFourData = LessonData(
            0,
            "tpc-II",
            "lvl-IV",
            "Stock exchanges"
        )
        val topicTwoLessonFiveData = LessonData(
            0,
            "tpc-II",
            "lvl-V",
            "The S&P 500"
        )
        val topicTwoLessonSixData = LessonData(
            0,
            "tpc-II",
            "lvl-VI",
            "Company size"
        )
        val topicTwoLessonSevenData = LessonData(
            0,
            "tpc-II",
            "lvl-VII",
            "Penny stocks"
        )
        val topicTwoLessonEightData = LessonData(
            0,
            "tpc-II",
            "lvl-VIII",
            "Dividends"
        )
        val topicTwoLessonNineData = LessonData(
            0,
            "tpc-II",
            "lvl-IX",
            "Stork splits"
        )
        val topicTwoLessonTenData = LessonData(
            0,
            "tpc-II",
            "lvl-X",
            "Order Types"
        )
        val topicTwoLessonElevenData =
            LessonData(
                0,
                "tpc-II",
                "lvl-XI",
                "Margins"
            )
        val topicTwoLessonTwelveData =
            LessonData(
                0,
                "tpc-II",
                "lvl-XII",
                "Short selling"
            )
        val topicTwoLessonThirteenData =
            LessonData(
                0,
                "tpc-II",
                "lvl-XIII",
                "Extended hours"
            )

        val topicThreeLessonOneData = LessonData(
            0,
            "tpc-III",
            "lvl-I",
            "First glance"
        )
        val topicThreeLessonTwoData = LessonData(
            0,
            "tpc-III",
            "lvl-II",
            "Company culture"
        )
        val topicThreeLessonThreeData =
            LessonData(
                0,
                "tpc-III",
                "lvl-III",
                "Visionary leaders"
            )
        val topicThreeLessonFourData =
            LessonData(
                0,
                "tpc-III",
                "lvl-IV",
                "Competitive advantage"
            )
        val topicThreeLessonFiveData =
            LessonData(
                0,
                "tpc-III",
                "lvl-V",
                "Evangelists"
            )
        val topicThreeLessonSixData = LessonData(
            0,
            "tpc-III",
            "lvl-VI",
            "Growing industry"
        )

        val topicFourLessonOneData = LessonData(
            0,
            "tpc-IV",
            "lvl-I",
            "Balance sheets"
        )
        val topicFourLessonTwoData = LessonData(
            0,
            "tpc-IV",
            "lvl-II",
            "Inside ownership"
        )
        val topicFourLessonThreeData =
            LessonData(
                0,
                "tpc-IV",
                "lvl-III",
                "Cash flow"
            )
        val topicFourLessonFourData = LessonData(
            0,
            "tpc-IV",
            "lvl-IV",
            "Cash and debt"
        )
        val topicFourLessonFiveData = LessonData(
            0,
            "tpc-IV",
            "lvl-V",
            "Spending money wisely"
        )
        val topicFourLessonSixData = LessonData(
            0,
            "tpc-IV",
            "lvl-VI",
            "Sales growth"
        )

        val topicFiveLessonOneData = LessonData(
            0,
            "tpc-V",
            "lvl-I",
            "Your first stock"
        )
        val topicFiveLessonTwoData = LessonData(
            0,
            "tpc-V",
            "lvl-II",
            "Diversifying your portfolio"
        )
        val topicFiveLessonThreeData =
            LessonData(
                0,
                "tpc-V",
                "lvl-III",
                "Building a portfolio"
            )
        val topicFiveLessonFourData = LessonData(
            0,
            "tpc-V",
            "lvl-IV",
            "Risk versus reward"
        )
        val topicFiveLessonFiveData = LessonData(
            0,
            "tpc-V",
            "lvl-V",
            "Timeline and Temperament"
        )
        val topicFiveLessonSixData = LessonData(
            0,
            "tpc-V",
            "lvl-VI",
            "Mistakes to avoid"
        )
        val topicFiveLessonSevenData =
            LessonData(
                0,
                "tpc-V",
                "lvl-VII",
                "When to sell"
            )

        val topicSixLessonOneData = LessonData(
            0,
            "tpc-VI",
            "lvl-I",
            "What or who is a broker"
        )
        val topicSixLessonTwoData = LessonData(
            0,
            "tpc-VI",
            "lvl-II",
            "How do you set up a brokerage account"
        )
        val topicSixLessonThreeData = LessonData(
            0,
            "tpc-VI",
            "lvl-III",
            "Funding your account"
        )
        val topicSixLessonFourData = LessonData(
            0,
            "tpc-VI",
            "lvl-IV",
            "Buying your first shares"
        )
        val topicSixLessonFiveData = LessonData(
            0,
            "tpc-VI",
            "lvl-V",
            "Monitoring your investment"
        )

        lessons.clear()
        lessons.addAll(listOf(topicOneLessonOneData, topicOneLessonTwoData, topicOneLessonThreeData, topicOneLessonFourData, topicOneLessonFIveData, topicOneLessonSixData, topicOneLessonSevenData,

            topicTwoLessonOneData, topicTwoLessonTwoData, topicTwoLessonThreeData, topicTwoLessonFourData, topicTwoLessonFiveData, topicTwoLessonSixData, topicTwoLessonSevenData, topicTwoLessonEightData, topicTwoLessonNineData, topicTwoLessonTenData, topicTwoLessonElevenData, topicTwoLessonTwelveData, topicTwoLessonThirteenData,

            topicThreeLessonOneData, topicThreeLessonTwoData, topicThreeLessonThreeData, topicThreeLessonFourData, topicThreeLessonFiveData, topicThreeLessonSixData,

            topicFourLessonOneData, topicFourLessonTwoData, topicFourLessonThreeData, topicFourLessonFourData, topicFourLessonFiveData, topicFourLessonSixData,

            topicFiveLessonOneData, topicFiveLessonTwoData, topicFiveLessonThreeData, topicFiveLessonFourData, topicFiveLessonFiveData, topicFiveLessonSixData, topicFiveLessonSevenData,

            topicSixLessonOneData, topicSixLessonTwoData, topicSixLessonThreeData, topicSixLessonFourData, topicSixLessonFiveData))

        loadLessons(lessons)
    }
}
