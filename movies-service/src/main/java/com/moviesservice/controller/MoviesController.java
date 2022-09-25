package com.moviesservice.controller;

import com.moviesservice.dao.MoviesRepo;
import com.moviesservice.entity.Movies;
import com.moviesservice.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService service;

    @Autowired
    private MoviesRepo repo;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public ResponseEntity<List<Movies>> getAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/get/{mid}")
    public ResponseEntity<Movies> findById(@PathVariable Long mid){
        return ResponseEntity.ok(repo.findById(mid).orElse(null));
    }

    @PostMapping("/add")
    public ResponseEntity<Movies> addAll(@RequestBody Movies mo){
        return ResponseEntity.ok(repo.save(mo));
    }
}
