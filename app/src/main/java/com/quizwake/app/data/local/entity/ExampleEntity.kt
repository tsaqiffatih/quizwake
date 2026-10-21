package com.quizwake.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "example")
data class ExampleEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String
)
