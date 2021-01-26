package com.mjourney.service.interfaces;

import com.mjourney.entities.RiverCruise;

import java.util.List;

public interface IRiverCruiseService {
	List<RiverCruise> findAll();

	RiverCruise findOne(Long id);

	RiverCruise save(RiverCruise riverCruise);

	void delete(Long id);
}
