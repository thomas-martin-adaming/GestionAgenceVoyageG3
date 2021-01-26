package com.clientui.proxies;

import java.util.List;

import com.clientui.beans.RiverCruiseBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "microservice-journey", url = "localhost:9092/")
public interface MicroServiceRiverCruiseProxies {

	@GetMapping("/riverCruise")
	List<RiverCruiseBean> findAll();

	@GetMapping("/riverCruise/{idriverCruise}")
	RiverCruiseBean findOne();

	@PostMapping("/riverCruise")
	RiverCruiseBean save();

	@DeleteMapping("/riverCruise/{idRiverCruise}")
	void delete();



}
