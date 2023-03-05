package com.example.tunisair.services;

import org.springframework.stereotype.Service;

import com.example.tunisair.models.Flight;

import com.example.tunisair.repositories.FlightRepository;

@Service
public class FlightService {
    
    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
		// super();
		this.flightRepository = flightRepository;
	}


    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    public Flight findById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }
}
