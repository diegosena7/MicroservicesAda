package com.ada.microsservice.movie.controller;

import com.ada.microsservice.movie.model.Movie;
import com.ada.microsservice.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public Long countAll() {
        return movieService.countAll();
    }

    @GetMapping("/{imdb}")
    public Optional<Movie> execute(@PathVariable String imdb){
        return movieService.execute(imdb);
    }

}
