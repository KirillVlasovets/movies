package com.gorstreller.movies.model.entity

import javax.persistence.*

@Table(name = "movies_positions_participants_characters")
@Entity
data class MovieConnection (
    @ManyToOne
    @JoinColumn(name = "movie_id")
    var movie: Movie,

    @ManyToOne
    @JoinColumn(name = "position_id")
    var position: Position,

    @ManyToOne
    @JoinColumn(name = "participant_id")
    var participant: Participant,

    @ManyToOne
    @JoinColumn(name = "character_id")
    var character: Character,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
)