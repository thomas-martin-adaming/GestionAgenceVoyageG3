package com.clientui.proxies;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.clientui.beans.RoleBean;

@FeignClient(name = "zuul-server-role", url = "localhost:9004/")
public interface MicroServiceRoleProxies {
	
	@GetMapping(value = "/roles")
	public List<RoleBean> findAll();

	@GetMapping(value = "/roles/{rId}")
	public RoleBean findOne(@PathVariable("rId") Long id);

	@PostMapping(value = "/roles")
	public RoleBean save(@RequestBody RoleBean role);

	@DeleteMapping(value = "/roles/{rId}")
	public void delete(@PathVariable("rId") Long id);
}
