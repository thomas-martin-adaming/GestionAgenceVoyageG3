package com.mjourney.service.interfaces;

import com.mjourney.entities.Flight;
import com.mjourney.entities.TrainRide;

import java.util.List;

public interface ITrainRideService {
	List<TrainRide> findAll();

	TrainRide findOne(Long id);

	TrainRide save(TrainRide trainRide);

	void delete(Long id);

}
