package com.bookingservice.controller;

import com.bookingservice.dao.BookingRepo;
import com.bookingservice.entity.Booking;
import com.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService service;

    @Autowired
    private BookingRepo repo;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public ResponseEntity<List<Booking>> getAll(){
        return ResponseEntity.ok(service.getAllBooking());
    }

    @GetMapping("/get/{bid}")
    public ResponseEntity<Booking> findById(@PathVariable Long bid){
        return ResponseEntity.ok(repo.findById(bid).orElse(null));
    }

    @PostMapping("/add")
    public ResponseEntity<Booking> addAll(@RequestBody Booking bk){
        return ResponseEntity.ok(repo.save(bk));
    }
}
