package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.TourpackageDTO;
import com.example.demo.entity.Itinerary;
import com.example.demo.entity.Tourpackage;
import com.example.demo.repository.TourpackageRepo;

@Service
public class TourpackageService {

	@Autowired
	private TourpackageRepo tourRepository;

	public Tourpackage createTourPackage(TourpackageDTO tourPackageDTO) {
		// Convert DTO to entity
		Tourpackage tourPackage = new Tourpackage();
		tourPackage.setName(tourPackageDTO.getName());
		tourPackage.setLocation(tourPackageDTO.getLocation());
		tourPackage.setTourtype(tourPackageDTO.getTourType());
		tourPackage.setPrice(tourPackageDTO.getPrice());
		tourPackage.setDescription(tourPackageDTO.getDescription());

		// Get the itinerary list from the DTO and associate with the tour package
		List<Itinerary> itineraryList = tourPackageDTO.getItineraryList();
		if (itineraryList != null) {
			for (Itinerary itinerary : itineraryList) {
				itinerary.setTourPackage(tourPackage); // Set tour package reference in each itinerary
			}
			tourPackage.setItinerary(itineraryList); // Set itinerary list in tour package
		}

		// Save the TourPackage entity
		return tourRepository.save(tourPackage);
	}
}
