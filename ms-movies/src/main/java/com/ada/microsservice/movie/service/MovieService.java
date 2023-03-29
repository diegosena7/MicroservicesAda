package com.ada.microsservice.movie.service;

import com.ada.microsservice.movie.model.Movie;
import com.ada.microsservice.movie.model.MovieEntity;
import com.ada.microsservice.movie.model.mapper.MovieMapper;
import com.ada.microsservice.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    private final MovieMapper movieMapper = Mappers.getMapper(MovieMapper.class);
    public Long countAll() {
        return movieRepository.count();
    }

    public Optional<Movie> execute (String imdb){
        final Optional<MovieEntity> optional = movieRepository.findByImdbIdIgnoreCase(imdb);
        return optional.map(movieMapper::of);
    }

    public Optional<Movie> getRandomMovie() {
        final long count = movieRepository.count();
        final int index = (int) (Math.random() * count);
        final Optional<MovieEntity> optional = movieRepository.findAll(PageRequest.of(index, 1)).stream().findFirst();
        return optional.map(movieMapper::of);
    }
}
