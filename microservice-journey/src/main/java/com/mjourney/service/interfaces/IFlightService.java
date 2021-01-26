package com.mjourney.service.interfaces;

import com.mjourney.entities.Flight;

import java.util.List;

public interface IFlightService {
	List<Flight> findAll();

	Flight findOne(Long id);

	Flight save(Flight flight);

	void delete(Long id);
}
