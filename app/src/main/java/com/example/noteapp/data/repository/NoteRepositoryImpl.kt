package com.example.noteapp.data.repository

import com.example.noteapp.data.db.NoteDao
import com.example.noteapp.domain.repository.NoteRepository
import com.example.noteapp.domain.mappers.toDomain
import com.example.noteapp.domain.mappers.toEntity
import com.example.noteapp.domain.models.NoteDomain
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
): NoteRepository {

    override suspend fun saveNote(note: NoteDomain) {
        noteDao.saveNote(note.toEntity())
    }

    override suspend fun getNote(note: NoteDomain): List<NoteDomain> {
        return noteDao.getNotes()
            .map { it.toDomain() }
    }

    override suspend fun deleteNote(id: String) {
        noteDao.deleteNote(id)
    }

}