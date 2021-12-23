package com.composenotes.feature_note.presentation.notes

import com.composenotes.feature_note.domain.model.Note
import com.composenotes.feature_note.domain.util.NoteOrder
import com.composenotes.feature_note.domain.util.OrderType

data class NotesStates(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false
)
