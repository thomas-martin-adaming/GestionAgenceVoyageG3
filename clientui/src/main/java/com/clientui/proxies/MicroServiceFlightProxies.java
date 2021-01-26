package com.clientui.proxies;

import com.clientui.beans.FlightBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@FeignClient(name = "microservice-journey", url = "localhost:9092/")
public interface MicroServiceFlightProxies {

	@GetMapping("/flights")
	List<FlightBean> findAll();

	@GetMapping("/flight/{idFlight}")
	FlightBean findOne();

	@PostMapping("/flight")
	FlightBean save();

	@DeleteMapping("/flight/{idFlight}")
	void delete();


}
