package com.composenotes.feature_note.domain.use_case

import com.composenotes.feature_note.domain.model.InvalidNoteException
import com.composenotes.feature_note.domain.model.Note
import com.composenotes.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title cannot be empty!")
        }
        noteRepository.insertNote(note)
    }

}