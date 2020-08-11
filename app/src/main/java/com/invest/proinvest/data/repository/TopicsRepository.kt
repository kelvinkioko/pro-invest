package com.invest.proinvest.data.repository

import android.app.Application
import com.invest.proinvest.data.InvestDatabase
import com.invest.proinvest.data.dao.TopicDao
import com.invest.proinvest.data.model.TopicData

class TopicsRepository(application: Application) {

    private val db = InvestDatabase.getDatabase(application)
    private val topicsDao: TopicDao = db.topicDao()

    fun insertTopics(topicData: TopicData) {
        topicsDao.insertTopics(topicData)
    }

    fun loadTopics(): List<TopicData> {
        return topicsDao.loadTopics()
    }

    fun countTopics(): Int {
        return topicsDao.countTopics()
    }

    fun deleteTopics() {
        topicsDao.deleteTopics()
    }
}
