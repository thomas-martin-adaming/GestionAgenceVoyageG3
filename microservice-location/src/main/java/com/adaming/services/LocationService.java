package com.adaming.services;

import java.util.List;
import com.adaming.entities.Location;

public interface LocationService {

	List<Location> findAll();
	Location findOne(Long id);
	Location saveLocation(Location uIn);
	List<Location> findNotDeleted();
	void deleteLocation(Long id);
	
	void suppLocation(Long id);
}
