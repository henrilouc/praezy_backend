package com.prayz.controller

import com.prayz.service.MusicSearchService
import kotlinx.coroutines.reactor.mono
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/music")
class MusicController(private val musicSearchService: MusicSearchService) {

    @GetMapping("/search")
    fun searchSongs(@RequestParam query: String): Mono<List<Pair<String, String>>> {
        return mono { musicSearchService.searchSongs(query) }
    }
}
