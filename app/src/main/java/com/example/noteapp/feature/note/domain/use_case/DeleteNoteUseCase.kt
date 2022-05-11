package com.example.noteapp.feature.note.domain.use_case

import com.example.noteapp.feature.note.domain.module.Note
import com.example.noteapp.feature.note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note:Note){
        repository.deleteNote(note)
    }
}