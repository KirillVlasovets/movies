package com.gorstreller.movies.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "positions")
open class Position (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "name", nullable = false)
    var name: String? = null,

    @OneToMany(mappedBy = "position")
    @JsonIgnore
    var movieConnection: MutableSet<MovieConnection> = mutableSetOf(),
)
