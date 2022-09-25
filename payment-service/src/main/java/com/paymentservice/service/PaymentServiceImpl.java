package com.paymentservice.service;

import com.paymentservice.dao.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepo repo;

//    @Override
//    public Customer getCustomer(Long cid) {
//        List<Customer> list = (List<Customer>) repo;
//        return list.stream().filter(customer ->customer.getCid().equals(cid)).findAny().orElse(null);
//
//    }
}
