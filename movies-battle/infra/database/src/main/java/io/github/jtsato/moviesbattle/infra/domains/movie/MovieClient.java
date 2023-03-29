package io.github.jtsato.moviesbattle.infra.domains.movie;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "movies", url = "localhost:8082")
public interface MovieClient {

    @GetMapping(value = "/movies/byImdbId/{imdbId}")
    MovieResponse getMovieByImdbId(@PathVariable("imdbId") final String imdbId);

    @GetMapping(value = "/movies/count")
    MoviesCountResponse getAllMoviesCount();

    @GetMapping(value = "/movies/random")
    MovieResponse getRandomMovie();
}
