package com.gorstreller.movies.model.entity

import javax.persistence.*

@Table(name = "movies")
@Entity
data class Movie (
    @Id
    var id: Long = 0,
    var name: String? = null,
    @OneToMany(mappedBy = "movie")
    var movieConnection: List<MovieConnection> = listOf(),

)


