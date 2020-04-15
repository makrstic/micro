package com.example.demo.product;

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
public class ProductController {

	// Inject Service
	@Autowired
	private ProductService productService;
	
	// CRUD API Endpoints defined by Repository will be exposed by Framework
	// http://localhost:8080/products
	
	// Map URL endpoint to Method
	@GetMapping("/products/hello")
	public String hello() {
		return "Hello World: Product Controller!";
	}
}
