package com.example.demo.product;
import org.springframework.data.annotation.Id;

/**
 * Define Data Model recorded to MongoDB
 * 
 * @author mkrstic
 *
 */
public class Product {

	// Handled by the Framework
	@Id
	private String id;
	
	private String productName;
	private int productPrice;
	private int productSKU;
	
	// Getters & Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductSKU() {
		return productSKU;
	}
	public void setProductSKU(int productSKU) {
		this.productSKU = productSKU;
	}
	
	
}
