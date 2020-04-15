package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implements ProductService with Business Logic
 * 
 * @author mkrstic
 *
 */

@Service
public class ProductServiceImpl implements ProductService {

	// Inject Repository
	@Autowired
	ProductRepository productRepository;
	
	// No specific Business Logic - Just default CRUD ops
}
