package com.oop.exam.service;

import com.oop.exam.model.Movie;
import com.oop.exam.model.Review;


import java.util.LinkedList;

public class MovieManager {
    private String name;
    private LinkedList<Movie> movies;

    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie name){
        movies.add(name);
    }
    public Review findMovie(String name){
        return();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovies(LinkedList<Movie> movies) {
        this.movies = movies;
    }
}
