package com.ada.microsservice.movie.controller;

import com.ada.microsservice.movie.model.Movie;
import com.ada.microsservice.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/count")
    public ResponseEntity<Long> countAll() {
        return ResponseEntity.ok().body(movieService.countAll());
    }

    @GetMapping("/byImdbId/{imdb}")
    public ResponseEntity<Optional<Movie>> execute(@PathVariable String imdb){
        return ResponseEntity.ok().body(movieService.execute(imdb));
    }

    @GetMapping("/random")
    public ResponseEntity<Optional<Movie>> getRandom() {
        return ResponseEntity.ok().body(movieService.getRandomMovie());
    }

}
