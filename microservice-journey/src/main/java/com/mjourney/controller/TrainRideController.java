package com.mjourney.controller;

import com.mjourney.entities.TrainRide;
import com.mjourney.service.interfaces.ITrainRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@CrossOrigin
@RestController
public class TrainRideController {
	@Autowired
	ITrainRideService trainRideService;

	@GetMapping("/trainRide")
	public List<TrainRide> findAll() {
		return trainRideService.findAll();
	}

	@GetMapping("/trainRide/{idJourney}")
	public TrainRide findOne(@PathVariable("idJourney") Long id) {
		return trainRideService.findOne(id);
	}

	@PostMapping("/trainRide")
	public TrainRide save(@RequestBody TrainRide trainRide) {
		return trainRideService.save(trainRide);
	}

	@DeleteMapping("/trainRide/{idJourney}")
	public void delete(@PathVariable("idJourney") Long id) {
		trainRideService.delete(id);
	}
}
