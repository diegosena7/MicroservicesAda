package com.ada.microsservice.movie.repository;

import com.ada.microsservice.movie.model.MovieEntity;
import com.cosium.spring.data.jpa.entity.graph.repository.EntityGraphJpaRepository;
import com.cosium.spring.data.jpa.entity.graph.repository.EntityGraphQuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends EntityGraphJpaRepository<MovieEntity, Long>, EntityGraphQuerydslPredicateExecutor<MovieEntity> {

    Optional<MovieEntity> findByImdbIdIgnoreCase(final String ImdbId);
}