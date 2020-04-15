package com.example.demo.user;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

/**
 * Define Data Model recorded to MongoDB
 * 
 * @author mkrstic
 *
 */
public class User {

	// Handled by the Frameowrk
	@Id
	private String id;
	
	private String userName;
	private String userAddress;
	
	// Getters & Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	
}
