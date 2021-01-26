package com.clientui.proxies;

import com.clientui.beans.TrainRideBean;
import com.clientui.beans.VolBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;
import java.util.List;

@FeignClient(name = "microservice-journey", url = "localhost:9092/")
public interface MicroServiceTrainRideProxies {

	@GetMapping(value="/trainride")
	List<TrainRideBean> findAll();

	@GetMapping("/trainRide/{idTrainRide}")
	TrainRideBean findOne();

	@PostMapping("/trainRide")
	TrainRideBean save();

	@DeleteMapping("/trainRide/{idTrainRide}")
	void delete();



}
