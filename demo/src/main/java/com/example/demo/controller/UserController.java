package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

//this annotation is for rest api indicates it is performing rest services.
@RestController
public class UserController {
	
	//achieves dependency injection
	@Autowired
	private UserService userservice;
	
	//you inserted this line to avoid cross origins error(cors error not in the video).
	@CrossOrigin(origins = "http://localhost:4200")
	
	
	//gets the path from the host and then performs equal validation using the path variable
	@GetMapping("user/{username}/{password}")
	public int UserLogin(@PathVariable("username") String username1 , @PathVariable("password") String password1) {
		
		int flag = userservice.loginValidation(username1, password1);
		
		if(flag==0) {
			return 0;
		}
		
		return flag;
		
	}
	
	
	

}
