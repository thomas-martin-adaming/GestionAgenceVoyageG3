package com.clientui.proxies;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.LocationBean;

@FeignClient(name = "microservice-location", url = "localhost:9091/")
public interface MicroServiceLocationProxies {
	
	@GetMapping(value = "/locations")
	public List<LocationBean> findAllLocation();

	@GetMapping(value = "/locations/{pId}")
	public LocationBean findOneLocation(@PathVariable("pId") Long id);

	@PostMapping(value = "/locations")
	public LocationBean saveLocation(@RequestBody LocationBean location);

	@DeleteMapping(value = "/locations/{lId}")
	public void deleteLocation(@PathVariable("lId") Long id);
	
	@PutMapping(value = "/locations/{lId}")
	public LocationBean suppLocation(@PathVariable("lId") Long id);
	
	@GetMapping(value="/locationsNotDeleted")
	public List<LocationBean> findNotDeletedLocation();
}
