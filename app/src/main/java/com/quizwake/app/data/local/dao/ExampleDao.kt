package com.quizwake.app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.quizwake.app.data.local.entity.ExampleEntity

@Dao
interface ExampleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: ExampleEntity)

    @Query("SELECT * FROM example WHERE id = :id")
    suspend fun getById(id: Int): ExampleEntity?

    @Query("SELECT * FROM example")
    suspend fun getAll(): List<ExampleEntity>
}
