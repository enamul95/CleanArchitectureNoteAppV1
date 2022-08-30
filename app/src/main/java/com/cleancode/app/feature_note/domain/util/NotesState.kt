package com.cleancode.app.feature_note.domain.util

import com.cleancode.app.feature_note.domain.model.Note

data class NotesState(
    val notes : List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible:Boolean = false
)
