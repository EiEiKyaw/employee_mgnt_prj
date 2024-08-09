package org.akee.testing.employee_mgnt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/")
	public String getWelcome() {
		return "Welcome to Employee Management Project";
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/home")
	public String getHome() {
		return "Welcome to Employee Management Project";
	}

}
