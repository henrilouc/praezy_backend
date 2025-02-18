package com.prayz.repository

import com.prayz.model.Setlist
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface SetlistRepository : JpaRepository<Setlist, UUID>
