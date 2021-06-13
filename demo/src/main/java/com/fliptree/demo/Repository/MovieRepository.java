package com.fliptree.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.fliptree.demo.Model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer>{

     //Optional<Movie> findByRelease__Year(Number release_year);

 } 