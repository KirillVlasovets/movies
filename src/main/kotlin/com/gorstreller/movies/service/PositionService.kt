package com.gorstreller.movies.service

import com.gorstreller.movies.repository.PositionRepository
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PositionService (
    private val positionRepository: PositionRepository
) {
    fun findAll(pageable: Pageable) = positionRepository.findAll(pageable)
}