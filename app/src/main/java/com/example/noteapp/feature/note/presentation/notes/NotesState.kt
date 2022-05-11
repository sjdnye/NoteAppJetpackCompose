package com.example.noteapp.feature.note.presentation.notes

import com.example.noteapp.feature.note.domain.module.Note
import com.example.noteapp.feature.note.domain.util.NoteOrder
import com.example.noteapp.feature.note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
