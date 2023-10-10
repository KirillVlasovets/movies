package com.gorstreller.movies.service

import com.gorstreller.movies.exception.EntityNotFoundException
import com.gorstreller.movies.model.entity.Participant
import com.gorstreller.movies.repository.ParticipantRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ParticipantService(
    private val participantRepository: ParticipantRepository
) {
    fun findAll(pageable: Pageable): Page<Participant?> = participantRepository.findAll(pageable)

    fun create(participant: Participant): Participant {
        val existParticipant = findById(participant.id)
        val newName = participant.name
        if (existParticipant.name == newName) return existParticipant
        return participantRepository.save(existParticipant.apply { name = newName })
    }

    fun findById(id: Long): Participant = participantRepository.findByIdOrNull(id) ?: throw EntityNotFoundException("")
}