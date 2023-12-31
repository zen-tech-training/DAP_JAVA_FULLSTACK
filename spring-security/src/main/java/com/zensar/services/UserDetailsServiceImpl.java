package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zensar.entity.User;
import com.zensar.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUserName(username).get(0);
		
		System.out.println(user);

		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(user.getRoles());

		List<GrantedAuthority> authorities = new ArrayList<>();

		authorities.add(simpleGrantedAuthority);

		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getpassword(),
				authorities);
	}

}
