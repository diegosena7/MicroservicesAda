package io.github.jtsato.moviesbattle.configuration;

import feign.Feign;
import feign.form.spring.SpringFormEncoder;
import io.github.jtsato.moviesbattle.infra.domains.movie.MovieClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieMicrosserviceConfiguration {

    @Bean
    MovieClient movieClient() {
        return Feign.builder().encoder(new SpringFormEncoder()).target(MovieClient.class, "http://localhost:8082/movies");
    }
}
