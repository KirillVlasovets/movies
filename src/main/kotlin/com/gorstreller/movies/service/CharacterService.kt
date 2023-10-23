package com.gorstreller.movies.service

import com.gorstreller.movies.model.entity.Character
import com.gorstreller.movies.repository.CharacterRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class CharacterService(
    private val characterRepository: CharacterRepository
) {
    fun create(character: Character): Character {
        return characterRepository.findCharacterByNameAndMovie(character.name, character.movie) ?:
        characterRepository.save(character)
    }

    fun findAll(pageable: Pageable): Page<Character> = characterRepository.findAll(pageable)
}