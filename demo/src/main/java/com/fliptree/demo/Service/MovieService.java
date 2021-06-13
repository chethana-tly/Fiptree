package com.fliptree.demo.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.fliptree.demo.Model.Movie;
import com.fliptree.demo.Repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Autowired
    MovieRepository repository;

    @Autowired
    RestTemplate template;

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    public Movie getMovie(Number release_year) {
        Optional<Movie> movies = this.repository.findByRelease__Year(release_year);

        if (movies.isPresent()) {
            return movies.get();
        } else {
            return null;
        }
    }

    public List<Movie> getAllMovies() {
        // https://subsequent-jealous-jersey.glitch.me/mcu.json
        String url = "http://vvijithnair.mynetgear.com:8000/index.json";
        Movie[] output = this.getRestTemplate().getForObject(url, Movie[].class);
        return Arrays.asList(output);
    }

    public Movie saveMovie(Movie movie) {
        if (movie.getMovie_id() % 2 == 0) {
            movie.setStatus("Even Year Release");
        } else {
            movie.setStatus("Odd Year Release");
        }
        return this.repository.save(movie);
    }

    public Movie updateMovie(Integer id, String ratingName) {
        Movie movieTobeUpated = this.repository.findById(id).get();
        movieTobeUpated.setRating_name(ratingName);
        return this.repository.save(movieTobeUpated);

    }

}