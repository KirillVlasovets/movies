package com.gorstreller.movies.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "characters")
open class Character (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "name", nullable = false)
    var name: String? = null,

    @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id", nullable = false)
    var movie: Movie? = null,

    @OneToMany(mappedBy = "character")
    @Column(nullable = false)
    @JsonIgnore
    var movieConnection: MutableSet<MovieConnection> = mutableSetOf(),
    )
