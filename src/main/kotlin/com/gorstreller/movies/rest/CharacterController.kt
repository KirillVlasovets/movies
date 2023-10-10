package com.gorstreller.movies.rest

import com.gorstreller.movies.model.entity.Character
import com.gorstreller.movies.service.CharacterService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CharacterController(
    val characterService: CharacterService
) {
    @Operation(summary = "Find all characters")
    @GetMapping("/characters")
    fun findAll(pageable: Pageable) = characterService.findAll(pageable)

    @Operation(summary = "Create new character")
    @PostMapping("/characters/new")
    fun create(character: Character) = characterService.create(character)
}