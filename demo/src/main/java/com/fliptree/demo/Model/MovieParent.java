package com.fliptree.demo.Model;

 
import java.util.List;

 

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class MovieParent {
 
@JsonAlias("Marvel Cinematic Universe")
List<Movie> movies;
 
public List<Movie> getMovies() {
    return movies;
}
public void setMovies(List<Movie> movies) {
    this.movies = movies;
} 
}