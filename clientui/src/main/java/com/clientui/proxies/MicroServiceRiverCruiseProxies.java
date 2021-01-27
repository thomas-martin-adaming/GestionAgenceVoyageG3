package com.clientui.proxies;

import java.util.List;

import com.clientui.beans.RiverCruiseBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;

@FeignClient(name = "microservice-journey-riverCruise", url = "localhost:9092/")
public interface MicroServiceRiverCruiseProxies {

	@GetMapping("/riverCruise")
	List<RiverCruiseBean> findAll();

	@GetMapping("/riverCruise/{idriverCruise}")
	RiverCruiseBean findOne(@PathParam("idriverCruise") Long id);

	@PostMapping("/riverCruise")
	RiverCruiseBean save(@RequestBody RiverCruiseBean riverCruise);

	@DeleteMapping("/riverCruise/{idRiverCruise}")
	void delete(@PathParam("idriverCruise") Long id);



}
