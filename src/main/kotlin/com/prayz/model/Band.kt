package com.prayz.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "band")
data class Band(
    @Id
    val id: UUID = UUID.randomUUID(),
    val name: String
)