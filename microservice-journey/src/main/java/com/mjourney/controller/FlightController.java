package com.mjourney.controller;

import com.mjourney.entities.Flight;
import com.mjourney.service.interfaces.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class FlightController {

	@Autowired
	IFlightService flightService;

	@GetMapping("/flights")
	public List<Flight> findAll() {
		return flightService.findAll();
	}

	@GetMapping("/flight/{idFlight}")
	public Flight findOne(@PathParam("idFlight") Long id) {
		return flightService.findOne(id);
	}

	@PostMapping("/flight")
	public Flight save(@RequestBody Flight flight) {
		return flightService.save(flight);
	}

	@DeleteMapping("/flight/{idFlight}")
	public void delete(@PathParam("idflight") Long id) {
		flightService.delete(id);
	}
}
