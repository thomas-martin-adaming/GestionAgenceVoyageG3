package com.clientui.proxies;

import com.clientui.beans.TrainRideBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@FeignClient(name = "microservice-journey-trainride", url = "localhost:9092/")
public interface MicroServiceTrainRideProxies {

	@GetMapping(value="/trainride")
	List<TrainRideBean> findAll();

	@GetMapping("/trainRide/{idTrainRide}")
	TrainRideBean findOne(@PathParam("idTrainRide") Long id);

	@PostMapping("/trainRide")
	TrainRideBean save(@RequestBody TrainRideBean trainRide);

	@DeleteMapping("/trainRide/{idTrainRide}")
	void delete(@PathParam("idTrainRide") Long id);

}
