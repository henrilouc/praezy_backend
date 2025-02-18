package com.prayz.service

import com.prayz.model.SetlistSong
import com.prayz.repository.SetlistRepository
import com.prayz.repository.SetlistSongRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class SetlistService(
    private val setlistRepository: SetlistRepository,
    private val setlistSongRepository: SetlistSongRepository
) {
    suspend fun addSongToSetlist(setlistId: UUID, title: String, url: String, platform: String) = withContext(Dispatchers.IO) {
        val setlist = setlistRepository.findById(setlistId).orElseThrow { Exception("Setlist not found") }
        val song = SetlistSong(setlist = setlist, title = title, url = url, platform = platform)
        setlistSongRepository.save(song)
    }
}
