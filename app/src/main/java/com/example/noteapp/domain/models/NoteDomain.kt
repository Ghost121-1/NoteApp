package com.example.noteapp.domain.models

import java.util.UUID

data class NoteDomain(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val deprecated: String
)
