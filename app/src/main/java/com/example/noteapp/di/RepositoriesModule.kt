package com.example.noteapp.di

import com.example.noteapp.data.repository.NoteRepositoryImpl
import com.example.noteapp.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindNoteRepository(
        noteRepositoryImpl: NoteRepositoryImpl
    ): NoteRepository

}