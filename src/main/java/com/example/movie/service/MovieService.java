package com.example.movie.service;

import com.example.movie.domain.Movie;

import java.util.List;

public interface MovieService {
    Movie add(Movie movie);
    Movie get(int id);
    List<Movie> get();
    Movie update(Movie movie);
    void delete(int id);
}
