package com.example.noteapp.feature.note.domain.use_case

import com.example.noteapp.feature.note.domain.module.InvalidNoteException
import com.example.noteapp.feature.note.domain.module.Note
import com.example.noteapp.feature.note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){

            throw InvalidNoteException("The title of the note can not be empty")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The content of the note can not be empty")
        }

        repository.insertNote(note)
    }
}