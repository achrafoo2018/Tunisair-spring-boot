package com.example.tunisair.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tunisair.models.Flight;

import com.example.tunisair.repositories.FlightRepository;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    public Flight findById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }
}
