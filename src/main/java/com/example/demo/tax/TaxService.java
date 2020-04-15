package com.example.demo.tax;

/**
 * Defines TaxService and describes abstract methods.
 * 
 * @author mkrstic
 *
 */
public interface TaxService {
	public abstract String tax(String userId, String productId);
}
