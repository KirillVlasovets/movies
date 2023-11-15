package com.gorstreller.movies.model.entity

import com.gorstreller.movies.model.key.MovieConnectionKey
import javax.persistence.*

@Table(name = "movies_positions_participants_characters")
@Entity
open class MovieConnection (
    @EmbeddedId
    var id: MovieConnectionKey? = null,

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    var movie: Movie? = null,

    @ManyToOne
    @MapsId("positionId")
    @JoinColumn(name = "position_id")
    var position: Position? = null,

    @ManyToOne
    @MapsId("participantId")
    @JoinColumn(name = "participant_id")
    var participant: Participant? = null,

    @ManyToOne
    @MapsId("characterId")
    @JoinColumn(name = "character_id")
    var character: Character? = null,
)
