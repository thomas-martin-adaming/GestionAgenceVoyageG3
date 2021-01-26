package com.mjourney.controller;

import com.mjourney.entities.TrainRide;
import com.mjourney.service.interfaces.ITrainRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class TrainRideController {
	@Autowired
	ITrainRideService trainRideService;

	@GetMapping("/trainRide")
	public List<TrainRide> findAll() {
		return trainRideService.findAll();
	}

	@GetMapping("/trainRide/{idTrainRide}")
	public TrainRide findOne(@PathParam("idTrainRide") Long id) {
		return trainRideService.findOne(id);
	}

	@PostMapping("/trainRide")
	public TrainRide save(@RequestBody TrainRide trainRide) {
		return trainRideService.save(trainRide);
	}

	@DeleteMapping("/trainRide/{idTrainRide}")
	public void delete(@PathParam("idTrainRide") Long id) {
		trainRideService.delete(id);
	}
}
