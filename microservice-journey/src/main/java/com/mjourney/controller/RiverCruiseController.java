package com.mjourney.controller;

import com.mjourney.entities.RiverCruise;
import com.mjourney.service.interfaces.IRiverCruiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class RiverCruiseController {
	@Autowired
	IRiverCruiseService riverCruiseService;

	@GetMapping("/riverCruise")
	public List<RiverCruise> findAll() {
		return riverCruiseService.findAll();
	}

	@GetMapping("/riverCruise/{idriverCruise}")
	public RiverCruise findOne(@PathParam("idriverCruise") Long id) {
		return riverCruiseService.findOne(id);
	}

	@PostMapping("/riverCruise")
	public RiverCruise save(@RequestBody RiverCruise riverCruise) {
		return riverCruiseService.save(riverCruise);
	}

	@DeleteMapping("/riverCruise/{idRiverCruise}")
	public void delete(@PathParam("idriverCruise") Long id) {
		riverCruiseService.delete(id);
	}
}
