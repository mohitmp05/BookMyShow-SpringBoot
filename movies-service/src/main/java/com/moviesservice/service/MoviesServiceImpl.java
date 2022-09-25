package com.moviesservice.service;

import com.moviesservice.dao.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class MoviesServiceImpl implements MoviesService{

    @Autowired
    private MoviesRepo repo;

//    @Override
//    public Customer getCustomer(Long cid) {
//        List<Customer> list = (List<Customer>) repo;
//        return list.stream().filter(customer ->customer.getCid().equals(cid)).findAny().orElse(null);
//
//    }
}
