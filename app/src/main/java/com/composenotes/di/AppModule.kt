package com.composenotes.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.composenotes.feature_note.data.repository.NoteRepositoryImpl
import com.composenotes.feature_note.data.source.NoteDatabase
import com.composenotes.feature_note.domain.repository.NoteRepository
import com.composenotes.feature_note.domain.use_case.DeleteNoteUseCase
import com.composenotes.feature_note.domain.use_case.GetNotesUseCase
import com.composenotes.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase (@ApplicationContext context: Context): NoteDatabase =
        Room.databaseBuilder(
            context,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

//    @Provides
//    @Singleton
//    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
//        return NoteUseCases(
//            getNotesUseCase = GetNotesUseCase(repository),
//            deleteNoteUseCase = DeleteNoteUseCase(repository)
//        )
//    }

}