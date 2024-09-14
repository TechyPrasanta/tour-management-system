package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookingDTO;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Status;
import com.example.demo.entity.Tourpackage;
import com.example.demo.entity.User;
import com.example.demo.repository.BookingRepo;
import com.example.demo.repository.TourpackageRepo;
import com.example.demo.repository.UserRepo;


@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepository;

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private TourpackageRepo tourPackageRepository;

    public Booking createBooking(BookingDTO bookingDTO) {
        // Fetch the user by userId
        Optional<User> userOptional = userRepository.findById(bookingDTO.getUserId());
        if (!userOptional.isPresent()) {
            throw new RuntimeException("User not found with id: " + bookingDTO.getUserId());
        }

        // Fetch the tour package by tourPackageId
        Optional<Tourpackage> tourPackageOptional = tourPackageRepository.findById(bookingDTO.getTourPackageId());
        if (!tourPackageOptional.isPresent()) {
            throw new RuntimeException("Tour Package not found with id: " + bookingDTO.getTourPackageId());
        }

        // Create new booking entity
        Booking booking = new Booking();
        booking.setStatus(Status.Booked);
        booking.setUser(userOptional.get());
        booking.setTourPackage(tourPackageOptional.get());
        //booking.setStatus(bookingDTO.getStatus()); // Enum type
        booking.setBookingDate(bookingDTO.getBookingDate());
        
        // Save booking
		return bookingRepository.save(booking);

        // Save booking
        
    }
}

