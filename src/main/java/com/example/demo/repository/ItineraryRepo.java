package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Itinerary;

public interface ItineraryRepo extends JpaRepository<Itinerary,Integer>{

}
