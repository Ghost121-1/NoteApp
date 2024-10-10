package com.example.noteapp.domain.repository

import com.example.noteapp.domain.models.NoteDomain

interface NoteRepository {

    suspend fun saveNote(note: NoteDomain)

    suspend fun getNotes(): List<NoteDomain>

    suspend fun deleteNote(id: String)

}