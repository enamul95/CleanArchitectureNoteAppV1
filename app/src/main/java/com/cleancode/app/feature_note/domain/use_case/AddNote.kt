package com.cleancode.app.feature_note.domain.use_case

import com.cleancode.app.feature_note.domain.model.InvalidNoteException
import com.cleancode.app.feature_note.domain.model.Note
import com.cleancode.app.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend  operator fun invoke(note: Note){
        if(note.title.isNotBlank()){
            throw InvalidNoteException("title of the note can't be empty")
        }

        if(note.content.isNotBlank()){
            throw InvalidNoteException("content of the note can't be empty")
        }
        repository.insertNote(note)
    }
}