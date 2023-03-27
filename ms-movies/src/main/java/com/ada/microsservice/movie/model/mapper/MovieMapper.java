package com.ada.microsservice.movie.model.mapper;

import com.ada.microsservice.movie.model.Movie;
import com.ada.microsservice.movie.model.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MovieMapper {

    Movie of(final MovieEntity movieEntity);
    @Mapping(target = "score", ignore = true)
    MovieEntity of(final Movie movie);
}
