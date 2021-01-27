package com.operatingcompagny.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.operatingcompagny.entities.OperatingCompagny;

public interface OperatingCompagnyRepository extends JpaRepository<OperatingCompagny, Long> {

}