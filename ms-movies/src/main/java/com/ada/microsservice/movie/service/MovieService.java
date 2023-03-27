package com.ada.microsservice.movie.service;

import com.ada.microsservice.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Long countAll() {
        return movieRepository.count();
    }
}
