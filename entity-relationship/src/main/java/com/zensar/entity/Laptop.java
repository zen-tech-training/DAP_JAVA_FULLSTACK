package com.zensar.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	

	public Laptop() {
		super();
	}

	public Laptop(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	public Laptop(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
