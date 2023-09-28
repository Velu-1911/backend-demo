package com.example.demo.service;

import org.springframework.stereotype.Repository;

//this userService is just a implementation of our interface.
//you add @repository to show that this is a service which performs update insertion deletion and retrieval.
@Repository
public interface UserService {
	public int loginValidation(String username, String password);

}
