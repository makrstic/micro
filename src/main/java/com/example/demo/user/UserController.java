package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implements MVC Controller
 * 
 * @author mkrstic
 *
 */
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	// CRUD API Endpoints defined by Repository will be exposed by Framework
	// http://localhost:8080/users
	
	// Map URL endpoint to Method
	@GetMapping("/users/hello")
	public String hello() {
		return "Hello World: User Controller";
	}
}
