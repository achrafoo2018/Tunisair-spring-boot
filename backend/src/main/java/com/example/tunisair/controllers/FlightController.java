package com.example.tunisair.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.tunisair.models.Flight;
import com.example.tunisair.services.FlightService;


@RestController
@RequestMapping("/api/flights")
public class FlightController {
    
    private FlightService flightService;

    public FlightController(FlightService flightService) {
		// super();
		this.flightService = flightService;
	}

    @PostMapping
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight) {
        return new ResponseEntity<Flight>(flightService.save(flight), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long id) {
        Flight flight = flightService.findById(id);
        if (flight == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(flight, HttpStatus.OK);
        }
    }

    // other methods omitted for brevity
}
