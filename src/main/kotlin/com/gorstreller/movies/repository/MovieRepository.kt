package com.gorstreller.movies.repository

import com.gorstreller.movies.model.entity.Movie
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface MovieRepository: JpaRepository<Movie, Long>, PagingAndSortingRepository<Movie, Long> {
    override fun findAll(pageable: Pageable): Page<Movie?>

    fun findMovieByNameContaining(movieName: String, pageable: Pageable): Page<Movie?>

    fun findMovieByName(name: String): Movie?
}