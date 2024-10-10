package com.example.noteapp.data.db
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.noteapp.data.models.NoteEntity

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveNote(note: NoteEntity)

    @Query("SELECT * FROM note")
    suspend fun getNotes(): List<NoteEntity>

    @Query("DELETE FROM note WHERE id = :id")
    suspend fun deleteNote(id: String)
}