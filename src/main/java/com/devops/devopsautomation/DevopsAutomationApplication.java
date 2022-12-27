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
		System.out.println("Application Started ... ");
	}
	
	@GetMapping("/msg")
	public String msg() {
		System.out.println("Api call");
		return "Hello Jay";
	}
	@GetMapping(path = "/")
	public String Message() {
		System.out.println("Api call");
		return "Hello Jay";
	}
	

}
