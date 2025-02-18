package com.prayz.repository

import com.prayz.model.Band
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface BandRepository : JpaRepository<Band, UUID>
