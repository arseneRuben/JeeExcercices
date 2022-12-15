/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exo4.entity;

/**
 *
 * @author isi
 */
public class Movie extends Entity {

    private String title;
    private float yr;
    private float score;
    private int votes;
    private int director;

    public Movie(int id, String title, float yr, float score, int votes, int director) {
        super(id);
        this.title = title;
        this.yr = yr;
        this.score = score;
        this.votes = votes;
        this.director = director;
    }

  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getYr() {
        return yr;
    }

    public void setYr(float yr) {
        this.yr = yr;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

}
