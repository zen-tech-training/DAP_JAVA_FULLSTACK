package com.zensar.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "MyUser")
public class User {

	@Id
	@GeneratedValue
	private int id;
	
	private String userName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user",fetch = FetchType.EAGER)
	private List<Laptop> laptop;
	
	

	public User() {
		super();
	}

	public User(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	
	

	public User(String userName) {
		super();
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	
	
	
	
	
	
	
	
	
}
