package com.mjourney.service.impl;

import com.mjourney.entities.RiverCruise;
import com.mjourney.repositories.RiverCruiseRepository;
import com.mjourney.service.interfaces.IRiverCruiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RiverCruiseService implements IRiverCruiseService {

	@Autowired
	RiverCruiseRepository riverCruiseRepository;

	@Override
	public List<RiverCruise> findAll() {
		return riverCruiseRepository.findAll();
	}

	@Override
	public RiverCruise findOne(Long id) {
		return riverCruiseRepository.findById(id).get();
	}

	@Override
	public RiverCruise save(RiverCruise riverCruise) {
		return riverCruiseRepository.save(riverCruise);
	}

	@Override
	public void delete(Long id) {
		riverCruiseRepository.deleteById(id);
	}

}
