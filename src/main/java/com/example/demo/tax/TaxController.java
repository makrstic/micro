package com.example.demo.tax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.product.Product;
import com.example.demo.user.User;

@RestController
public class TaxController {
	
	// Inject Service
	@Autowired
	TaxService taxService;
	
	@GetMapping("/tax/hello")
	public String hello() {
		return "Tax: Hello World!";
	}
	
	@GetMapping("/tax/api2")
	public String tax(
			@RequestParam(name="userId") String userId,
			@RequestParam(name="productId") String productId) {
		
		return taxService.tax(userId, productId);
	}
		
}
