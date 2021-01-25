package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Location;
import com.adaming.repositories.LocationRepository;

@Service
public class LocationServiceImp implements LocationService {

	@Autowired
	private LocationRepository lRep;
	
	@Override
	public List<Location> findAll() {
		return lRep.findAll();
	}

	@Override
	public Location findOne(Long id) {
		return lRep.findById(id).get();
	}

	@Override
	public Location saveLocation(Location location) {
		return lRep.save(location);
	}

	@Override
	public List<Location> findNotDeleted() {
		return lRep.findByDeleted(false);
	}

	@Override
	public void deleteLocation(Long id) {
		lRep.deleteById(id);
	}

	@Override
	public void suppLocation(Long id) {
	//	lRep.suppLocation(id);
	}

}
