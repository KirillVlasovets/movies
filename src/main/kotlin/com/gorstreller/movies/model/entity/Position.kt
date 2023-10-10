package com.gorstreller.movies.model.entity

import javax.persistence.*

@Entity
@Table(name = "positions")
data class Position (
    @Column(name = "name", nullable = false)
    var name: String,

    @OneToMany(mappedBy = "position")
    var movieConnection: MutableSet<MovieConnection> = mutableSetOf(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
)
