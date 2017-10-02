package com.example.movie.controller;

import com.example.movie.domain.Movie;
import com.example.movie.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    @GetMapping("/api/movies")
    public List<Movie> getMovies(){
        return movieService.get();
    }

    @PostMapping("/api/movies")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.add(movie);
    }

    @PutMapping("/api/movies")
    public Movie updateMovie(@RequestBody Movie movie){
        return movieService.update(movie);
    }

    @DeleteMapping("/api/movies/{id}")
    public void deleteMovie(@PathVariable Integer id){
        movieService.delete(id);
    }
}
