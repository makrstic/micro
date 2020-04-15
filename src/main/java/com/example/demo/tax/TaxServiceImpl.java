package com.example.demo.tax;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.product.Product;
import com.example.demo.user.User;

/**
 * Implements TaxService with Business Logic
 * 
 * @author mkrstic
 *
 */
@Service
public class TaxServiceImpl implements TaxService {
	
	// Calculate Tax based on productPrice and userAddress
	public String tax(String userId, String productId) {
		RestTemplate restTemplate = new RestTemplate();
				
		// Get User by Id
		String userResourceUrl
		  = "http://localhost:8080/users/" + userId; 
		
		User user
			= restTemplate.getForObject(userResourceUrl, User.class);
		
		// Get Product by Id
		String productResourceUrl 
			= "http://localhost:8080/products/" + productId;
		
		Product product
			= restTemplate.getForObject(productResourceUrl, Product.class);
		
		// Calculate Tax based on Address
		if(user.getUserAddress().equals("11080")) {
			return "Zmun: " + product.getProductPrice() * 1.18;
		} else {
			return "Not Zemun: " + product.getProductPrice() * 2;
		}
		
	}
}
