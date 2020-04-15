package com.example.demo.user;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Handles CRUD for User table in Mongo DB
 * 
 * @author mkrstic
 *
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
	List<User> findByUserName(@Param("name") String name);
	
	// Expose CRUD to http://localhost:8080/users
}
