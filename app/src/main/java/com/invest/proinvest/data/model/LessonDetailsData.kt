package com.invest.proinvest.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.invest.proinvest.R
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "lessonDetails")
data class LessonDetailsData(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "topic_id") var topicID: String,
    @ColumnInfo(name = "lesson_id") var lessonID: String,
    @ColumnInfo(name = "lesson_details") var lessonDetails: Int
) : Parcelable

class LessonDetails(val loadDetails: (List<LessonDetailsData>) -> (Unit)) {

    private var lessons = mutableListOf<LessonDetailsData>()

    fun lessonsDetailsData() {
        val topicOneLessonOneData = LessonDetailsData(0, "tpc-I", "lvl-I", R.string.prologue)
        val topicOneLessonTwoData = LessonDetailsData(0, "tpc-I", "lvl-II", R.string.why_stock)
        val topicOneLessonThreeData = LessonDetailsData(0, "tpc-I", "lvl-III", R.string.financial_goals)
        val topicOneLessonFourData = LessonDetailsData(0, "tpc-I", "lvl-IV", R.string.compound_magic)
        val topicOneLessonFIveData = LessonDetailsData(0, "tpc-I", "lvl-V", R.string.pay_yourself)
        val topicOneLessonSixData = LessonDetailsData(0, "tpc-I", "lvl-VI", R.string.steps_to_saving)
        val topicOneLessonSevenData = LessonDetailsData(0, "tpc-I", "lvl-VII", R.string.timeline)

        val topicTwoLessonOneData = LessonDetailsData(0, "tpc-II", "lvl-I", R.string.db_what_is_stock)
        val topicTwoLessonTwoData = LessonDetailsData(0, "tpc-II", "lvl-II", R.string.db_ticker_symbols)
        val topicTwoLessonThreeData = LessonDetailsData(0, "tpc-II", "lvl-III", R.string.db_public_offerings)
        val topicTwoLessonFourData = LessonDetailsData(0, "tpc-II", "lvl-IV", R.string.db_stock_exchanges)
        val topicTwoLessonFiveData = LessonDetailsData(0, "tpc-II", "lvl-V", R.string.db_sandp)
        val topicTwoLessonSixData = LessonDetailsData(0, "tpc-II", "lvl-VI", R.string.db_company_size)
        val topicTwoLessonSevenData = LessonDetailsData(0, "tpc-II", "lvl-VII", R.string.db_penny_stocks)
        val topicTwoLessonEightData = LessonDetailsData(0, "tpc-II", "lvl-VIII", R.string.db_dividends)
        val topicTwoLessonNineData = LessonDetailsData(0, "tpc-II", "lvl-IX", R.string.db_stock_splits)
        val topicTwoLessonTenData = LessonDetailsData(0, "tpc-II", "lvl-X", R.string.db_order_types)
        val topicTwoLessonElevenData = LessonDetailsData(0, "tpc-II", "lvl-XI", R.string.db_margins)
        val topicTwoLessonTwelveData = LessonDetailsData(0, "tpc-II", "lvl-XII", R.string.db_short_selling)
        val topicTwoLessonThirteenData = LessonDetailsData(0, "tpc-II", "lvl-XIII", R.string.db_extended_hours)

        val topicThreeLessonOneData = LessonDetailsData(0, "tpc-III", "lvl-I", R.string.dgi_first_glance)
        val topicThreeLessonTwoData = LessonDetailsData(0, "tpc-III", "lvl-II", R.string.dgi_company_culture)
        val topicThreeLessonThreeData = LessonDetailsData(0, "tpc-III", "lvl-III", R.string.dgi_visionary)
        val topicThreeLessonFourData = LessonDetailsData(0, "tpc-III", "lvl-IV", R.string.dgi_competitive)
        val topicThreeLessonFiveData = LessonDetailsData(0, "tpc-III", "lvl-V", R.string.dgi_evangelist)
        val topicThreeLessonSixData = LessonDetailsData(0, "tpc-III", "lvl-VI", R.string.dgi_industry)

        val topicFourLessonOneData = LessonDetailsData(0, "tpc-IV", "lvl-I", R.string.dld_balance_sheets)
        val topicFourLessonTwoData = LessonDetailsData(0, "tpc-IV", "lvl-II", R.string.dld_ownership)
        val topicFourLessonThreeData = LessonDetailsData(0, "tpc-IV", "lvl-III", R.string.dld_cash_flow)
        val topicFourLessonFourData = LessonDetailsData(0, "tpc-IV", "lvl-IV", R.string.dld_cash_debt)
        val topicFourLessonFiveData = LessonDetailsData(0, "tpc-IV", "lvl-V", R.string.dld_spending_money)
        val topicFourLessonSixData = LessonDetailsData(0, "tpc-IV", "lvl-VI", R.string.dld_sales_growth)

        val topicFiveLessonOneData = LessonDetailsData(0, "tpc-V", "lvl-I", R.string.dil_first_stock)
        val topicFiveLessonTwoData = LessonDetailsData(0, "tpc-V", "lvl-II", R.string.dil_diversifying)
        val topicFiveLessonThreeData = LessonDetailsData(0, "tpc-V", "lvl-III", R.string.dil_build_portfolio)
        val topicFiveLessonFourData = LessonDetailsData(0, "tpc-V", "lvl-IV", R.string.dil_risk_reward)
        val topicFiveLessonFiveData = LessonDetailsData(0, "tpc-V", "lvl-V", R.string.dil_timeline)
        val topicFiveLessonSixData = LessonDetailsData(0, "tpc-V", "lvl-VI", R.string.dil_mistakes)
        val topicFiveLessonSevenData = LessonDetailsData(0, "tpc-V", "lvl-VII", R.string.dil_sell)

        val topicSixLessonOneData = LessonDetailsData(0, "tpc-VI", "lvl-I", R.string.ds_broker)
        val topicSixLessonTwoData = LessonDetailsData(0, "tpc-VI", "lvl-II", R.string.ds_brokerage)
        val topicSixLessonThreeData = LessonDetailsData(0, "tpc-VI", "lvl-III", R.string.ds_funding)
        val topicSixLessonFourData = LessonDetailsData(0, "tpc-VI", "lvl-IV", R.string.ds_first_share)
        val topicSixLessonFiveData = LessonDetailsData(0, "tpc-VI", "lvl-V", R.string.ds_monitoring)

        lessons.clear()
        lessons.addAll(listOf(topicOneLessonOneData, topicOneLessonTwoData, topicOneLessonThreeData, topicOneLessonFourData, topicOneLessonFIveData, topicOneLessonSixData, topicOneLessonSevenData, topicTwoLessonOneData, topicTwoLessonTwoData, topicTwoLessonThreeData, topicTwoLessonFourData, topicTwoLessonFiveData, topicTwoLessonSixData, topicTwoLessonSevenData, topicTwoLessonEightData, topicTwoLessonNineData, topicTwoLessonTenData, topicTwoLessonElevenData, topicTwoLessonTwelveData, topicTwoLessonThirteenData,
            topicThreeLessonOneData, topicThreeLessonTwoData, topicThreeLessonThreeData, topicThreeLessonFourData, topicThreeLessonFiveData, topicThreeLessonSixData, topicFourLessonOneData, topicFourLessonTwoData, topicFourLessonThreeData, topicFourLessonFourData, topicFourLessonFiveData, topicFourLessonSixData,
            topicFiveLessonOneData, topicFiveLessonTwoData, topicFiveLessonThreeData, topicFiveLessonFourData, topicFiveLessonFiveData, topicFiveLessonSixData, topicFiveLessonSevenData, topicSixLessonOneData, topicSixLessonTwoData, topicSixLessonThreeData, topicSixLessonFourData, topicSixLessonFiveData))

        loadDetails(lessons)
    }
}
