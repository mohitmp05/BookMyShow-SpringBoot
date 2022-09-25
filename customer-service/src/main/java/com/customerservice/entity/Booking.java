package com.customerservice.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Booking {
    @Id
    private Long bid;
    private String time;
    private String address;
    private Long cid;

    @OneToMany(targetEntity=Movies.class, mappedBy="bid")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Movies> movies= new ArrayList<>();

    @OneToMany(targetEntity=Payment.class, mappedBy="bid")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Payment> payment= new ArrayList<>();

    public Booking() {
        super();
    }

    public Booking(Long bid, String time, String address, Long cid) {
        this.bid = bid;
        this.time = time;
        this.address = address;
        this.cid = cid;
    }

    public Booking(Long bid, String time, String address, Long cid, List<Movies> movies, List<Payment> payment) {
        this.bid = bid;
        this.time = time;
        this.address = address;
        this.cid = cid;
        this.movies = movies;
        this.payment = payment;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public List<Movies> getMovies() {
        return movies;
    }

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }
}
