package com.clientui.proxies;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.clientui.beans.UtilisateurBean;

@FeignClient(name = "zuul-server", url = "localhost:9004/")
public interface MicroServiceUtilisateurProxies {
	
	@GetMapping(value = "/users")
	public List<UtilisateurBean> findAll();

	@GetMapping(value = "/users/{uId}")
	public UtilisateurBean findOne(@PathVariable("uId") Long id);

	@PostMapping(value = "/users")
	public UtilisateurBean save(@RequestBody UtilisateurBean u);

	@DeleteMapping(value = "/users/{uId}")
	public void delete(@PathVariable("uId") Long id);

}
