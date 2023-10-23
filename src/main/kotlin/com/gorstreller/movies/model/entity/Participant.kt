package com.gorstreller.movies.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "participants")
open class Participant (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "name", nullable = false)
    var name: String? = null,

    @Column(name = "dob", nullable = false)
    var dateOfBirth: LocalDate? = null,

    @OneToMany(mappedBy = "participant")
    @JsonIgnore
    var movies: MutableSet<MovieConnection> = mutableSetOf(),
)