package com.example.noteapp.data.models
import android.icu.text.CaseMap.Title
import android.media.audiofx.AudioEffect.Descriptor
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class NoteEntity(
    @PrimaryKey val id: String,
    val title: String,
    val descriptor: String
)
