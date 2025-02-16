package com.prayz.service

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import org.springframework.stereotype.Service

@Service
class MusicSearchService {

    suspend fun searchSongs(query: String): List<Pair<String, String>> = coroutineScope {
        val spotifyResults = async(Dispatchers.IO) { searchSpotify(query) }
        val youtubeResults = async(Dispatchers.IO) { searchYouTube(query) }

        val results = mutableListOf<Pair<String, String>>()
        results.addAll(spotifyResults.await().take(3))
        results.addAll(youtubeResults.await().take(3))

        results
    }

    private fun searchSpotify(query: String): List<Pair<String, String>> {
        //TODO Vincular a API do spotify
        return listOf("Spotify Song 1" to "https://spotify.com/song1")

    }

    private fun searchYouTube(query: String): List<Pair<String, String>> {
        //TODO Vincular a API do youtube
        return listOf("YouTube Song 1" to "https://youtube.com/song1")
    }
}
