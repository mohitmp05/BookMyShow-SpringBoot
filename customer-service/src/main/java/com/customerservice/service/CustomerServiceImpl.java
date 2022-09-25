package com.customerservice.service;

import com.customerservice.dao.CustomerRepo;
import com.customerservice.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers = repo.findAll();
        return customers;
    }
}
