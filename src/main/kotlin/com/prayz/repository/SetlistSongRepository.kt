package com.prayz.repository

import com.prayz.model.SetlistSong
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface SetlistSongRepository : JpaRepository<SetlistSong, UUID>
