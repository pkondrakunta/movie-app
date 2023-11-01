/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.app.model;

/**
 *
 * @author Pragnya
 */
public class Movie {
    
    int movieID;
    String title;
    String maleLead;
    String femaleLead;
    int releaseYear;
    String genre;

    public Movie() {
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaleLead() {
        return maleLead;
    }

    public void setMaleLead(String maleLead) {
        this.maleLead = maleLead;
    }

    public String getFemaleLead() {
        return femaleLead;
    }

    public void setFemaleLead(String femaleLead) {
        this.femaleLead = femaleLead;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
