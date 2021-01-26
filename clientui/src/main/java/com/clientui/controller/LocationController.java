package com.clientui.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.clientui.beans.LocationBean;
import com.clientui.proxies.MicroServiceLocationProxies;

@RestController
@Controller
public class LocationController {
	
	@Autowired
	private MicroServiceLocationProxies mslp;

		@PostMapping(value = "/locations")
		public void addLocation(@RequestBody LocationBean l) {
			mslp.saveLocation(l);
		}

		@GetMapping(value = "/locations")
		public List<LocationBean> getAllLocation() {
			return mslp.findAllLocation();
		}

		@GetMapping(value = "/locations/{id}")
		public LocationBean findByIdLocation(@PathVariable long id) {
			return mslp.findOneLocation(id);
		}

		@DeleteMapping(value = "/locations/{id}")
		public void deleteLocation(@PathVariable long id) {
			mslp.deleteLocation(id);
		}

		@PutMapping(value = "/locations/{id}")
		public void deletedLocation(@PathVariable long id) {
			mslp.suppLocation(id);
		}
}
