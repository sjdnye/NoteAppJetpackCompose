package com.example.noteapp.feature.note.domain.use_case

import com.example.noteapp.feature.note.domain.module.Note
import com.example.noteapp.feature.note.domain.repository.NoteRepository

class GetSingleNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note?{
        return repository.getNoteById(id)
    }
}