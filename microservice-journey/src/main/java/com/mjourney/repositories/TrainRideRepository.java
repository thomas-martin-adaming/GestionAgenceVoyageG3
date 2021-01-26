package com.mjourney.repositories;

import com.mjourney.entities.TrainRide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRideRepository extends JpaRepository<TrainRide, Long> {

}
