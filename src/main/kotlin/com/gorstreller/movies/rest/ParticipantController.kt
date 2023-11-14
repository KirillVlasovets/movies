package com.gorstreller.movies.rest

import com.gorstreller.movies.service.ParticipantService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ParticipantController(
    val participantService: ParticipantService,
) {
    @Operation(summary = "Get all participants")
    @GetMapping("/participants")
    fun findAll(pageable: Pageable) = participantService.findAll(pageable)
}
