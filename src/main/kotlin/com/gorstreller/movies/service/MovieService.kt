package com.gorstreller.movies.service

import com.gorstreller.movies.exception.EntityNotFoundException
import com.gorstreller.movies.model.entity.Movie
import com.gorstreller.movies.repository.MovieRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MovieService(
    private val movieRepository: MovieRepository
) {
    fun create(movie: Movie): Movie {
        val movieName = movie.name!!
        val movieDirector = movie.director!!
        return movieRepository.findMovieByNameAndDirector(movieName, movieDirector) ?: movieRepository.save(movie)
    }

    fun update(movie: Movie): Movie {
        val existMovie = findById(movie.id!!)
        val newName = movie.name
        if(existMovie.name == newName) return existMovie
        return movieRepository.save(existMovie.apply { name = newName })
    }

    fun deleteMovieById(id: Long) {
        movieRepository.deleteById(id)
    }

    //TODO: log stash, elastic search, kibana.
    fun findById(id: Long): Movie = movieRepository.findByIdOrNull(id) ?: throw EntityNotFoundException("")

    fun findAll(pageable: Pageable): Page<Movie?> = movieRepository.findAll(pageable)

    fun findByName(movieName: String, pageable: Pageable): Page<Movie?> = movieRepository.findMovieByNameContaining(movieName, pageable)

    fun findByDirector(movieDirector: String, pageable: Pageable): Page<Movie?> = movieRepository.findMovieByDirectorContaining(movieDirector, pageable)
}