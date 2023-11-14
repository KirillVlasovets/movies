package com.gorstreller.movies.repository

import com.gorstreller.movies.model.entity.Position
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface PositionRepository: JpaRepository<Position, Long>, PagingAndSortingRepository<Position, Long> {
    override fun findAll(pageable: Pageable): Page<Position?>
}
