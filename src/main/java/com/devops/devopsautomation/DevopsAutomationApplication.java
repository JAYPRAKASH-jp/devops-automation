package com.devops.devopsautomation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devops.devopsautomation.model.Users;
import com.devops.devopsautomation.repo.UsersRepo;


@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}
	
	@Autowired UsersRepo userrepo;

	@GetMapping(path = "/welcome")
	public String welcome() {
		return "Hello from Docker";
	}
	@GetMapping(path = "/")
	public String welcomeApp() {
		return "Application is running";
	}
	
	@GetMapping(path ="/users")
	public List<com.devops.devopsautomation.model.Users> get(){
		return (List<Users>) userrepo.findAll();
	}
	
	@GetMapping(path ="/getuser/{id}")
	public Optional<Users> get(@PathVariable int id){
		return userrepo.findById(id);
	}
	
	@PostMapping(path ="/newusers")
	public Users save(@RequestBody Users users){
		return userrepo.save(users);
	}

}
