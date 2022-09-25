package com.customerservice.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private Long cid;
    private String cname;
    private int age;
    private int phone;

    @OneToMany(targetEntity=Booking.class, mappedBy="cid", fetch= FetchType.EAGER)
    private List<Booking> booking= new ArrayList<>();

    public Customer(){
        super();
    }

    public Customer(Long cid, String cname, int age, int phone, List<Booking> booking) {
        this.cid = cid;
        this.cname = cname;
        this.age = age;
        this.phone = phone;
        this.booking = booking;
    }

    public Customer(Long cid, String cname, int age, int phone) {
        this.cid = cid;
        this.cname = cname;
        this.age = age;
        this.phone = phone;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<Booking> getBooking() {
        return booking;
    }

    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }
}
