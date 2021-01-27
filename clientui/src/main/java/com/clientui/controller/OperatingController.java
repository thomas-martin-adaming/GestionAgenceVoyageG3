package com.clientui.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.clientui.beans.OperatingBean;
import com.clientui.proxies.MicroServiceOperatingProxies;

@RestController
public class OperatingController {
	
	@Autowired
	private MicroServiceOperatingProxies mslp;

		@PostMapping(value = "/operatingCompagnys")
		public void addOperating(@RequestBody OperatingBean l) {
			mslp.saveOperating(l);
		}

		@GetMapping(value = "/operatingCompagnys")
		public List<OperatingBean> getAllOperating() {
			return mslp.findAllOperating();
		}

		@GetMapping(value = "/operatingCompagnys/{id}")
		public Optional<OperatingBean> findByIdOperating(@PathVariable long id) {
			return mslp.findOneOperating(id);
		}

		@DeleteMapping(value = "/operatingCompagnys/{id}")
		public void deleteOperating(@PathVariable long id) {
			mslp.deleteOperating(id);
		}

		@PutMapping(value = "/operatingCompagnys/{id}")
		public void deletedOperating(@PathVariable long id) {
			mslp.suppOperating(id);
		}
}
