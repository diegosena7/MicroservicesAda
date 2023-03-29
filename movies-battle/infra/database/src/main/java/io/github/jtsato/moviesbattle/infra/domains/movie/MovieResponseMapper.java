package io.github.jtsato.moviesbattle.infra.domains.movie;

import io.github.jtsato.moviesbattle.core.domains.movie.model.Movie;
import org.mapstruct.Mapper;

@Mapper
public interface MovieResponseMapper {

    Movie of(final MovieResponse movieResponse);
    MovieResponse of(final Movie movie);
}
