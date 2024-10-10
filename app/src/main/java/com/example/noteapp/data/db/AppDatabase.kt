package com.example.noteapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.noteapp.data.models.NoteEntity

@Database(
    entities = [
        NoteEntity::class
    ],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        private const val DB_NAME = "note.database"

        fun build(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                DB_NAME,
            )
                .build()
        }
    }
}