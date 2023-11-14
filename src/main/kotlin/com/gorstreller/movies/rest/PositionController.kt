package com.gorstreller.movies.rest

import com.gorstreller.movies.service.PositionService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PositionController (
    private val positionService: PositionService
) {
    @Operation(summary = "Find all positions")
    @GetMapping("/positions")
    fun findAll(pageable: Pageable) = positionService.findAll(pageable)
}
