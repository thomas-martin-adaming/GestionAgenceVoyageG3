package com.mjourney.controller;

import com.mjourney.entities.RiverCruise;
import com.mjourney.service.interfaces.IRiverCruiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@CrossOrigin
@RestController
public class RiverCruiseController {
	@Autowired
	IRiverCruiseService riverCruiseService;

	@GetMapping("/riverCruise")
	public List<RiverCruise> findAll() {
		return riverCruiseService.findAll();
	}

	@GetMapping("/riverCruise/{idJourney}")
	public RiverCruise findOne(@PathVariable("idJourney") Long id) {
		return riverCruiseService.findOne(id);
	}

	@PostMapping("/riverCruise")
	public RiverCruise save(@RequestBody RiverCruise riverCruise) {
		return riverCruiseService.save(riverCruise);
	}

	@DeleteMapping("/riverCruise/{idJourney}")
	public void delete(@PathVariable("idJourney") Long id) {
		riverCruiseService.delete(id);
	}
}
