package com.moviesservice.dao;

import com.moviesservice.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepo extends JpaRepository<Movies,Long> {
}
