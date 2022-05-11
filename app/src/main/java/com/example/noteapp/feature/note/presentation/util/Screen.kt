package com.example.noteapp.feature.note.presentation.util

sealed class Screen(val route: String) {
    object NoteScreen: Screen("notes_Screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}