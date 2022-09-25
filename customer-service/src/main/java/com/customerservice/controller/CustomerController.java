package com.customerservice.controller;

import com.customerservice.dao.CustomerRepo;
import com.customerservice.entity.Customer;
import com.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok(service.getAllCustomer());
    }

    @GetMapping("/get/{cid}")
    public ResponseEntity<Customer> findById(@PathVariable Long cid){
        return ResponseEntity.ok(repo.findById(cid).orElse(null));
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addAll(@RequestBody Customer us){
        return ResponseEntity.ok(repo.save(us));
    }

}
