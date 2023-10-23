package com.gorstreller.movies.model.key

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
open class MovieConnectionKey: Serializable {
    @Column(name = "movie_id")
    var movieId: Long = 0
    @Column(name = "position_id")
    var positionId: Long = 0
    @Column(name = "participant_id")
    var participantId: Long = 0
    @Column(name = "character_id")
    var characterId: Long = 0
}
