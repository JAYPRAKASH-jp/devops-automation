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
	
	@GetMapping
	public String msg() {
		return "Hello Jay";
	}

}
