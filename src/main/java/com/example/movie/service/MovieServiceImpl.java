package com.example.movie.service;

import com.example.movie.domain.Movie;
import com.example.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public Movie add(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie get(int id) {
        return movieRepository.findOne(id);
    }

    @Override
    public List<Movie> get() {
        return movieRepository.findAll();
    }

    @Override
    public Movie update(Movie movie) {
        return add(movie);
    }

    @Override
    public void delete(int id) {
        movieRepository.delete(id);
    }
}
