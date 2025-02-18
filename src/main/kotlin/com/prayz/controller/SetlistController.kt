package com.prayz.controller

import com.prayz.model.SetlistSong
import com.prayz.service.SetlistService
import kotlinx.coroutines.reactor.mono
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.util.UUID

@RestController
@RequestMapping("/setlist")
class SetlistController(private val setlistService: SetlistService) {

    @PostMapping("/{setlistId}/add-song")
    fun addSongToSetlist(
        @PathVariable setlistId: UUID,
        @RequestParam title: String,
        @RequestParam url: String,
        @RequestParam platform: String
    ): Mono<SetlistSong> {
        return mono { setlistService.addSongToSetlist(setlistId, title, url, platform) }
    }
}
