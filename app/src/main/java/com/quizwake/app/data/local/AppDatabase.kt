package com.quizwake.app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.quizwake.app.data.local.dao.ExampleDao
import com.quizwake.app.data.local.entity.ExampleEntity

@Database(entities = [ExampleEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}
