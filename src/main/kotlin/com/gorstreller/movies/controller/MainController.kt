package com.gorstreller.movies.controller

import com.gorstreller.movies.service.MovieService
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.stream.Collectors
import java.util.stream.IntStream

@Controller
class MainController(
    val movieService: MovieService
) {

    @GetMapping("/movies")
    fun findAll(model: Model,
                @RequestParam(defaultValue = "1") page: Int,
                @RequestParam(defaultValue = "5") size: Int
    ): String {
        val moviePage = movieService.findPaginated(PageRequest.of(page - 1, size))

        model.addAttribute("moviePage", moviePage)
        val totalPages = moviePage.totalPages
        if (totalPages > 0) {
            val pageNumbers = IntStream.rangeClosed(1, totalPages)
                .boxed()
                .collect(Collectors.toList())
            model.addAttribute("pageNumbers", pageNumbers)
        }
        return "movies"
    }

    @GetMapping("/login")
    fun login() = "login"
}
