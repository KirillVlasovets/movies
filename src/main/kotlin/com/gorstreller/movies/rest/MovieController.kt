package com.gorstreller.movies.rest

import com.gorstreller.movies.model.entity.Movie
import com.gorstreller.movies.service.MovieService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["\${apiPrefix}/movies"])
class MovieController(
    val movieService: MovieService
) {

    // PUT url/rockets/id/start
    // POST url/rockets
    // GET url/rockets/id/status

    @Operation(summary = "Find all")
    @GetMapping
    fun findAll(pageable: Pageable) = movieService.findAll(pageable)

    @Operation(summary = "Create new movie")
    @PostMapping("/new")
    fun create(@RequestBody movie: Movie) = movieService.create(movie)

    @Operation(summary = "Find one movie by id")
    @GetMapping("/{id}")
    fun findMovieById(@PathVariable id: Long): Movie? = movieService.findById(id)

    @Operation(summary = "Delete one movie by id")
    @DeleteMapping("/{id}/delete")
    fun deleteMovieById(@PathVariable id: Long) = movieService.deleteMovieById(id)

    @Operation(summary = "Changing movie's info by id")
    @PutMapping("/{id}/edit")
    fun changeMovieInfoById(@RequestBody movie: Movie, @PathVariable id: Long) = movieService.update(movie)

    @Operation(summary = "Find movies by name")
    @GetMapping("/search")
    fun findMovieByName(@RequestParam(name = "name") movieName: String, pageable: Pageable) = movieService.findByName(movieName, pageable)

//    @Operation(summary = "Find movies by director")
//    @GetMapping("/movies/director={movieDirector}")
//    fun findMovieByDirector(@Param("movieDirector") @PathVariable movieDirector: String, pageable: Pageable) = movieService.findByDirector(movieDirector, pageable)
}