package com.invest.proinvest.data.repository

import android.app.Application
import com.invest.proinvest.data.InvestDatabase
import com.invest.proinvest.data.dao.LessonDao
import com.invest.proinvest.data.dao.LessonDetailsDao
import com.invest.proinvest.data.model.LessonData
import com.invest.proinvest.data.model.LessonDetailsData

class LessonRepository(application: Application) {

    private val db = InvestDatabase.getDatabase(application)
    private val lessonDao: LessonDao = db.lessonDao()
    private val lessonDetailsDao: LessonDetailsDao = db.lessonDetailsDao()

    fun insertLessons(lessonData: LessonData) {
        lessonDao.insertLessons(lessonData)
    }

    fun loadLessons(topic_id: String): List<LessonData> {
        return lessonDao.loadLessons(topic_id)
    }

    fun countLessons(topic_id: String): Int {
        return lessonDao.countLessons(topic_id)
    }

    fun deleteLessons() {
        lessonDao.deleteLessons()
    }

    fun insertLessonDetails(lessonDetails: LessonDetailsData) {
        lessonDetailsDao.insertLessonDetails(lessonDetails)
    }

    fun loadLessonDetails(topic_id: String, lesson_id: String): LessonDetailsData {
        return lessonDetailsDao.loadLessonDetails(topic_id, lesson_id)
    }

    fun countLessonDetails(topic_id: String, lesson_id: String): Int {
        return lessonDetailsDao.countLessonDetails(topic_id, lesson_id)
    }

    fun deleteLessonDetails() {
        lessonDetailsDao.deleteLessonDetails()
    }
}
