package com.gorstreller.movies.model.entity

import javax.persistence.*

@Table(name = "movies")
@Entity
open class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "name", nullable = false)
    var name: String? = null

    @Column(name = "director", nullable = false)
    var director: String? = null

    @Column(name = "producer", nullable = false)
    var producer: String? = null
}


