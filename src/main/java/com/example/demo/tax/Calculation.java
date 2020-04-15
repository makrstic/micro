package com.example.demo.tax;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.product.Product;
import com.example.demo.user.User;

public class Calculation {
	private User u;
	private Product p;
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	
	
}
