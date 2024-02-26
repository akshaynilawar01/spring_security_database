package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Entity;
import com.example.demo.repository.UserRepo;

@Component
public class CustomUserDetailService implements UserDetailsService{
 
	@Autowired
	private UserRepo userRepo;
	@Override
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Entity ent = userRepo.findByEmail(username);
		
		if(ent == null)
		{
			throw new UsernameNotFoundException("not found");
			
		}
		
		else
		{
			return new Configuration(ent);
		}
	}
	

}
