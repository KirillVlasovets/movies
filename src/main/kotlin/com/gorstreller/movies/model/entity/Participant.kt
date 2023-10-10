package com.gorstreller.movies.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "participants")
data class Participant (
    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "dob", nullable = false)
    var dateOfBirth: LocalDate,

    @OneToMany(mappedBy = "participant")
    var movies: MutableSet<MovieConnection> = mutableSetOf(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
)