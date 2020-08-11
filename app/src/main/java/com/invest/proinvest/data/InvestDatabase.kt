package com.invest.proinvest.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.invest.proinvest.data.dao.LessonDao
import com.invest.proinvest.data.dao.LessonDetailsDao
import com.invest.proinvest.data.dao.TopicDao
import com.invest.proinvest.data.model.LessonData
import com.invest.proinvest.data.model.LessonDetailsData
import com.invest.proinvest.data.model.TopicData

@Database(entities = [TopicData::class, LessonData::class, LessonDetailsData::class], version = 1)
abstract class InvestDatabase : RoomDatabase() {

    abstract fun topicDao(): TopicDao
    abstract fun lessonDao(): LessonDao
    abstract fun lessonDetailsDao(): LessonDetailsDao

    companion object {
        @Volatile
        private var INSTANCE: InvestDatabase? = null

        fun getDatabase(context: Context): InvestDatabase {
            var tempInstance = INSTANCE
            if (tempInstance == null) {
                tempInstance = Room.databaseBuilder(context.applicationContext,
                    InvestDatabase::class.java, "invest_database")
                    .allowMainThreadQueries()
                    .build()
            }
            return tempInstance
        }
    }
}
