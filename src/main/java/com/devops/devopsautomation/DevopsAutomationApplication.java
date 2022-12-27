package com.devops.devopsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}
	
	@GetMapping("/msg")
	public String msg() {
		return "Hello Jay";
	}
	@GetMapping(path = "/")
	public String Message() {
		return "Hello Jay";
	}
	@GetMapping(path = "/myName")
	public String myname() {
		return "My name is Jay!";
	}
	

}
