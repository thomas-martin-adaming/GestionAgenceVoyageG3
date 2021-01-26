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
import com.clientui.beans.UtilisateurBean;
import com.clientui.proxies.MicroServiceUtilisateurProxies;

@RestController
@Controller
public class UtilisateurController {
	
	@Autowired
	private MicroServiceUtilisateurProxies msup;


		@PostMapping(value = "/utilisateurs")
		public void add(@RequestBody UtilisateurBean u) {
			msup.save(u);
		}

		@GetMapping(value = "/utilisateurs")
		public List<UtilisateurBean> getAll() {
			return msup.findAll();
		}

		@GetMapping(value = "/utilisateurs/{id}")
		public UtilisateurBean findById(@PathVariable long id) {
			return msup.findOne(id);
		}

		@DeleteMapping(value = "/utilisateurs/{id}")
		public void delete(@PathVariable long id) {
			msup.delete(id);
		}
}

