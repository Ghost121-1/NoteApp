package com.example.noteapp.domain.mappers

import com.example.noteapp.data.models.NoteEntity
import com.example.noteapp.domain.models.NoteDomain

data class NoteMappers()

fun NoteEntity.toDomain() = NoteDomain(
    id = this.id,
    title = this.title,
    description = this.description
)

fun NoteDomain.toEntity() = NoteEntity(
    id = this.id,
    title = this.title,
    description = this.description
)