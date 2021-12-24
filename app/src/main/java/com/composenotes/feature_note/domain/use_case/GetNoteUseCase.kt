package com.composenotes.feature_note.domain.use_case

import com.composenotes.feature_note.domain.model.Note
import com.composenotes.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class GetNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? = noteRepository.getNoteById(id)
}