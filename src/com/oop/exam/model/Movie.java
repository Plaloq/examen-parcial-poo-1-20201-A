package com.oop.exam.model;

import java.util.ArrayList;
public class Movie {
    private ArrayList<Review> reviews;
    private String title;
    private int year;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Platform> platforms;
    private String synopsis;

    public Movie(String title){
        setTitle(title);
        reviews = new ArrayList<>();
        actors = new ArrayList<>();
        platforms = new ArrayList<>();
        setYear(year);
        setDirector(director);
        setSynopsis(synopsis);
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public ArrayList<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(ArrayList<Platform> plataforms) {
        this.platforms = plataforms;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
