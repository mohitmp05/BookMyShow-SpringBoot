package com.bookingservice.service;

import com.bookingservice.dao.BookingRepo;
import com.bookingservice.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingRepo repo;

    @Override
    public List<Booking> getAllBooking() {
        List<Booking> booking = repo.findAll();
        return booking;
    }
}
