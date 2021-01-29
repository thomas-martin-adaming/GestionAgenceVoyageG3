package com.mjourney.controller;

import com.mjourney.entities.Flight;
import com.mjourney.service.interfaces.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@CrossOrigin
@RestController
public class FlightController {

	@Autowired
	IFlightService flightService;

	@GetMapping("/flights")
	public List<Flight> findAll() {
		return flightService.findAll();
	}

	@GetMapping("/flight/{idJourney}")
	public Flight findOne(@PathVariable("idJourney") Long id) {
		return flightService.findOne(id);
	}

	@PostMapping("/flight")
	public Flight save(@RequestBody Flight flight) {
		return flightService.save(flight);
	}

	@DeleteMapping("/flight/{idJourney}")
	public void delete(@PathVariable("idJourney") Long idJourney) {
		flightService.delete(idJourney);
	}
}
