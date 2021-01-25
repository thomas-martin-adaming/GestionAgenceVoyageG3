package com.adaming.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.adaming.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

	List<Location> findByDeleted(boolean b);
	// void suppLocation(Long id);
}
