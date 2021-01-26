package com.mjourney.repositories;

import com.mjourney.entities.RiverCruise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiverCruiseRepository extends JpaRepository<RiverCruise,Long> {
}
