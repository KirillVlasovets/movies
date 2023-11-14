package com.gorstreller.movies.model.responses

import com.gorstreller.movies.model.entity.Movie

data class MovieResponse(
    val items: Iterable<Movie>,
    val hasNext: Boolean
)