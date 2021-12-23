package com.composenotes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.composenotes.ui.theme.*

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(RedOrange, RedPink, BabyBlue, Violet, LightGreen)
    }
}
