package com.quizwake.app.di

import android.content.Context
import androidx.room.Room
import com.quizwake.app.data.local.AppDatabase
import com.quizwake.app.data.local.dao.ExampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

/**
 * Provides the Room database and DAO instances.
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "quizwake.db"
        ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideExampleDao(database: AppDatabase): ExampleDao = database.exampleDao()
}
