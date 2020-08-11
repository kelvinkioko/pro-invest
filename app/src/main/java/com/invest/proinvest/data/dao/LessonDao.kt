package com.invest.proinvest.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.invest.proinvest.data.model.LessonData

@Dao
interface LessonDao {

    @Insert
    fun insertLessons(vararg lessonData: LessonData)

    @Query("SELECT * FROM lessons WHERE topic_id =:topic_id")
    fun loadLessons(topic_id: String): List<LessonData>

    @Query("SELECT COUNT(id) FROM lessons WHERE topic_id =:topic_id")
    fun countLessons(topic_id: String): Int

    @Query("DELETE FROM lessons")
    fun deleteLessons()
}
