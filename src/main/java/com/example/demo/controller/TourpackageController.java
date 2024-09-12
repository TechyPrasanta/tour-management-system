package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TourpackageDTO;
import com.example.demo.service.TourpackageService;

@RestController
@RequestMapping("/api/tours")
public class TourpackageController {
	
	 @Autowired
	 private TourpackageService tourService;
	 
	// Create a new tour package with itineraries
	 @PostMapping("/addtours")
	    public ResponseEntity<String> createTourPackage(@RequestBody TourpackageDTO tourpackageDTO) {
	        tourService.createTourPackage(tourpackageDTO);
	        return new ResponseEntity<>("Tour package created successfully", HttpStatus.CREATED);
	    }
}
