package com.fliptree.demo.Controller;

import java.util.List;

import com.fliptree.demo.Model.Movie;
import com.fliptree.demo.Service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**1. Get method : by the release year
2. Post method : odd index with one status and even index with one status
3. Put Method : update the rating_name */
@RestController
class MovieController{

    @Autowired 
    MovieService service;

    @GetMapping("movies/{release_year}")
    public  Movie  getMovies(@PathVariable Number release_year){
        return service.getMovie(release_year);
    }

    @PostMapping("movies")
    public Movie saveMovie(@RequestBody Movie movie)
    {
        return service.saveMovie(movie);
    }

    
    @PutMapping("movies/{id}")
    public Movie saveMovie(@PathVariable Integer id,@RequestParam String ratingName)
    {
        return service.updateMovie(id,ratingName);
    }


    @GetMapping("movies/all")
    public List< Movie>  getAllMovies( ){
        return service.getAllMovies( );
    }
}