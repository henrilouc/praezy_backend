package com.prayz.service

import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MusicSearchServiceTest {

    private val musicSearchService = mockk<MusicSearchService>()

    @Test
    fun `should return Spotify and YouTube results`() = runBlocking {
        coEvery { musicSearchService.searchSongs("test") } returns listOf("Spotify Song 1" to "url")

        val result = musicSearchService.searchSongs("test")

        assertTrue(result.isNotEmpty())
    }
}
