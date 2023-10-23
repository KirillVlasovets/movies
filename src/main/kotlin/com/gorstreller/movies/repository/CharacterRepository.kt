package com.gorstreller.movies.repository

import com.gorstreller.movies.model.entity.Character
import com.gorstreller.movies.model.entity.Movie
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface CharacterRepository: JpaRepository<Character, Long>, PagingAndSortingRepository<Character, Long> {
    override fun findAll(pageable: Pageable): Page<Character>

    fun findCharacterByNameAndMovie(name: String?, movie: Movie?): Character?

    fun findCharacterById(id: Long): Character

    fun findCharactersByMovieId(movieId: Long): List<Character>
}