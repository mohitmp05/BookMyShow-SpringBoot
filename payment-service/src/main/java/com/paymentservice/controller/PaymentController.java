package com.paymentservice.controller;

import com.paymentservice.dao.PaymentRepo;
import com.paymentservice.entity.Payment;
import com.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @Autowired
    private PaymentRepo repo;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public ResponseEntity<List<Payment>> getAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/get/{pid}")
    public ResponseEntity<Payment> findById(@PathVariable Long pid){
        return ResponseEntity.ok(repo.findById(pid).orElse(null));
    }

    @PostMapping("/add")
    public ResponseEntity<Payment> addAll(@RequestBody Payment pay){
        return ResponseEntity.ok(repo.save(pay));
    }
}
