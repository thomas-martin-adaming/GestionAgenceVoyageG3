package com.adaming.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Location;
import com.adaming.services.LocationService;


@RestController
@CrossOrigin
public class LocationController {

	@Autowired
	private LocationService lServ;

	@GetMapping(value = "locations")
	public List<Location> findAllLocation() {
		return lServ.findAll();
	}

	@GetMapping(value = "locations/{pId}")
	public Location findOneLocation(@PathVariable("pId") Long id) {
		return lServ.findOne(id);
	}

	@PostMapping(value = "locations")
	public Location saveLocation(@RequestBody Location location) {
		return lServ.saveLocation(location);
	}

	@DeleteMapping(value = "locations/{lId}")
	public void deleteLocation(@PathVariable("lId") Long id) {
		lServ.deleteLocation(id);
	}
	
	@PutMapping(value = "locations/{lId}")
	public Location suppLocation(@PathVariable("lId") Long id) {
		Location out = lServ.findOne(id);
		out.setDeleted(true);
		return lServ.saveLocation(out);
	}
	
	@GetMapping(value="/locationsNotDeleted")
	public List<Location> findNotDeleted(){
		return lServ.findNotDeleted();
	}
}
