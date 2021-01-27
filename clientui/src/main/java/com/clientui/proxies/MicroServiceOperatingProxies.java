package com.clientui.proxies;

import java.util.List;
import java.util.Optional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.OperatingBean;

@FeignClient(name = "operatingcompagny", url = "localhost:8081/")
public interface MicroServiceOperatingProxies {
	
	@GetMapping(value = "/operatingCompagnys")
	public List<OperatingBean> findAllOperating();

	@GetMapping(value = "/operatingCompagnys/{id}")
	public Optional<OperatingBean> findOneOperating(@PathVariable("id") Long id);

	@PostMapping(value = "/operatingCompagnys")
	public OperatingBean saveOperating(@RequestBody OperatingBean operating);

	@DeleteMapping(value = "/operatingCompagnys/{id}")
	public void deleteOperating(@PathVariable("i") Long id);
	
	@PutMapping(value = "/operatingCompagnys/{id}")
	public OperatingBean suppOperating(@PathVariable("id") Long id);
	
	
}
