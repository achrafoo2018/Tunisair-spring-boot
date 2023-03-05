package com.example.tunisair.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunisair.models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    
}
