package com.example.noteapp.feature.note.presentation.notes

import com.example.noteapp.feature.note.domain.module.Note
import com.example.noteapp.feature.note.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note:Note): NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
