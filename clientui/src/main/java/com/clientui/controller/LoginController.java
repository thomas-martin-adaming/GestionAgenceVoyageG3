package com.clientui.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import com.clientui.proxies.MicroServiceLoginProxies;


@RestController
@Controller
public class LoginController {
	
	@Autowired
	private MicroServiceLoginProxies msloginp;

}

