package io.github.jtsato.moviesbattle.infra.domains.movie;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import io.github.jtsato.moviesbattle.core.domains.movie.model.Movie;

import java.util.Optional;

public interface MovieClient {

    @RequestLine("GET htto://localhost:8082/movies/{imdb}")
    @Headers("Content-Type: application/json")
    Optional<Movie> findByImdbIdIgnoreCase(@Param String imdb);

    @RequestLine("GET htto://localhost:8082/movies")
    @Headers("Content-Type: application/json")
    long count();

    @RequestLine("GET htto://localhost:8082/movies/random")
    @Headers("Content-Type: application/json")
    Optional<Movie> findRandomMovie();
}
