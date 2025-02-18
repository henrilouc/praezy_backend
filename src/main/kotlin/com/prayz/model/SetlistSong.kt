package com.prayz.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "setlist_song")
data class SetlistSong(
    @Id
    val id: UUID = UUID.randomUUID(),

    @ManyToOne
    @JoinColumn(name = "setlist_id")
    val setlist: Setlist,

    val title: String,
    val url: String,
    val platform: String
)
