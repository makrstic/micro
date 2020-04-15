package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implements ProductService with Business Logic
 * 
 * @author mkrstic
 *
 */

@Service
public class UserServiceImpl implements UserService {
	// Inject Repository
	@Autowired
	UserRepository userRepository;
	
	// No specific Business Logic - just default CRUD ops
}
