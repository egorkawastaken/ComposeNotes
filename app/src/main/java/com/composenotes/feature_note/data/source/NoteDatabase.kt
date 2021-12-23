package com.composenotes.feature_note.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.composenotes.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "note_table"
    }
}