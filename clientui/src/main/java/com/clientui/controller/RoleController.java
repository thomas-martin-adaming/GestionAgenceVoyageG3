package com.clientui.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.clientui.beans.RoleBean;
import com.clientui.proxies.MicroServiceRoleProxies;

@RestController
@Controller
public class RoleController {
	
	@Autowired
	private MicroServiceRoleProxies msrp;

		@PostMapping(value = "/roles")
		public void add(@RequestBody RoleBean u) {
			msrp.save(u);
		}

		@GetMapping(value = "/roles")
		public List<RoleBean> getAll() {
			return msrp.findAll();
		}

		@GetMapping(value = "/roles/{id}")
		public RoleBean findById(@PathVariable long id) {
			return msrp.findOne(id);
		}

		@DeleteMapping(value = "/roles/{id}")
		public void delete(@PathVariable long id) {
			msrp.delete(id);
		}
}

