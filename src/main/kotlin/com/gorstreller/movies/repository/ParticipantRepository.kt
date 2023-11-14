package com.gorstreller.movies.repository

import com.gorstreller.movies.model.entity.Participant
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface ParticipantRepository: JpaRepository<Participant, Long>, PagingAndSortingRepository<Participant, Long> {
    override fun findAll(pageable: Pageable): Page<Participant?>
}
