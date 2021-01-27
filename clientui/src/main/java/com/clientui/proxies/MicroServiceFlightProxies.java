package com.clientui.proxies;

import com.clientui.beans.FlightBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;
import java.util.List;

@FeignClient(name = "microservice-journey-flight", url = "localhost:9092/")
public interface MicroServiceFlightProxies {

	@GetMapping("/flights")
	List<FlightBean> findAll();

	@GetMapping("/flight/{idFlight}")
	FlightBean findOne(@PathParam("idFlight") Long id);

	@PostMapping("/flight")
	FlightBean save(@RequestBody FlightBean flight);

	@DeleteMapping("/flight/{idFlight}")
	void delete(@PathParam("idflight") Long id);

}
