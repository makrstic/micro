package com.example.demo.product;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.user.User;

/**
 * Handles CRUD for Product Table in MongoDB
 * 
 * @author mkrstic
 *
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
	List<Product> findByProductName(@Param("name") String name);
	
	// Expose CRUD to http://localhost:8080/products
}
 