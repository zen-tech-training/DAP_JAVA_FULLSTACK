package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.User;
import com.zensar.repository.UserRepository;

@RestController
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@GetMapping("/all")
	public String welcome() {
		return "<h2>Welcome Everyone</h2>";
	}
	
	
	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String welocomeAdmin() {
		return "<h2>Welcome Admin</h2>";
	}
	
	
	
	@GetMapping("/user")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String welcomeUser() {
		return "<h2>Welcome User</h2>";
	}
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		user.setpassword(passwordEncoder.encode(user.getpassword()));
		return userRepository.save(user);
		
	}

}
