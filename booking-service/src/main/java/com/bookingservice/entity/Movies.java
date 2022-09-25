package com.bookingservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {
    @Id
    private Long mid;
    private String name;
    private String genre;
    private String duration;

    private Long bid;

    public Movies() {
        super();
    }

    public Movies(Long mid, String name, String genre, String duration, Long bid) {
        this.mid = mid;
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.bid = bid;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }
}