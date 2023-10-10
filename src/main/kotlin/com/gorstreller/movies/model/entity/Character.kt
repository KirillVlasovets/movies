package com.gorstreller.movies.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "characters")
data class Character(
    @Column(name = "name", nullable = false)
    var name: String,

    @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id", nullable = false)
//    @JsonIgnore
    var movie: Movie,

    @OneToMany(mappedBy = "character")
    @Column(nullable = false)
    var movieConnection: MutableSet<MovieConnection> = mutableSetOf(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    )