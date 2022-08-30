package com.cleancode.app.feature_note.domain.use_case

data class NoteUserCase(
    val getNotes: GetNotes,
    val  deleteNote: DeleteNote,
    val addNote: AddNote

)
