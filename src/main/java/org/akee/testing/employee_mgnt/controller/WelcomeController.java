package org.akee.testing.employee_mgnt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String getWelcome() {
		return "Welcome to Employee Management Project";
	}
	
	@GetMapping("/home")
	public String getHome() {
		return "Welcome to Employee Management Project";
	}

}
