package com.mjourney.service.impl;

import com.mjourney.entities.TrainRide;
import com.mjourney.repositories.TrainRideRepository;
import com.mjourney.service.interfaces.ITrainRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TrainRideService implements ITrainRideService {

	@Autowired
	TrainRideRepository trainRideRepository;

	@Override
	public List<TrainRide> findAll() {
		return trainRideRepository.findAll();
	}

	@Override
	public TrainRide findOne(Long id) {
		return trainRideRepository.findById(id).get();
	}

	@Override
	public TrainRide save(TrainRide trainRide) {
		return trainRideRepository.save(trainRide);
	}

	@Override
	public void delete(Long id) {
		trainRideRepository.deleteById(id);
	}

}
