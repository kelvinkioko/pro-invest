package com.invest.proinvest.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.invest.proinvest.data.model.LessonDetailsData

@Dao
interface LessonDetailsDao {

    @Insert
    fun insertLessonDetails(vararg lessonDetails: LessonDetailsData)

    @Query("SELECT * FROM lessonDetails WHERE topic_id =:topic_id AND lesson_id =:lesson_id")
    fun loadLessonDetails(topic_id: String, lesson_id: String): LessonDetailsData

    @Query("SELECT COUNT(id) FROM lessonDetails WHERE topic_id =:topic_id AND lesson_id =:lesson_id")
    fun countLessonDetails(topic_id: String, lesson_id: String): Int

    @Query("DELETE FROM lessons")
    fun deleteLessonDetails()
}
