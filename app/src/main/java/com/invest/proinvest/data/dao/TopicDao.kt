package com.invest.proinvest.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.invest.proinvest.data.model.TopicData

@Dao
interface TopicDao {

    @Insert
    fun insertTopics(vararg topicData: TopicData)

    @Query("SELECT * FROM topics")
    fun loadTopics(): List<TopicData>

    @Query("SELECT COUNT(id) FROM topics")
    fun countTopics(): Int

    @Query("DELETE FROM topics")
    fun deleteTopics()
}
