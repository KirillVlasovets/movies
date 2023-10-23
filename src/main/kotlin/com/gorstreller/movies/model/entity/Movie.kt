package com.gorstreller.movies.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import javax.persistence.*

@Table(name = "movies")
@Entity
open class Movie : Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column(name = "name")
    var name: String? = null
    @OneToMany(mappedBy = "movie")
    @JsonIgnore
    var characters: MutableList<Character> = mutableListOf()
    @OneToMany(mappedBy = "movie")
    @JsonIgnore
    var movieConnection: MutableList<MovieConnection> = mutableListOf()
}


