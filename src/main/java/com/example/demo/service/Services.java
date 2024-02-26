package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entity;
import com.example.demo.repository.UserRepo;

@Service
public class Services {
	
	@Autowired
	
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public Entity saveEntity(Entity entity)
	{
		String pass = entity.getPassword();
		//String pass1 = passwordEncoder.encode(pass);
		entity.setPassword(passwordEncoder.encode(pass));
		return userRepo.save(entity);
	}

	
	public List<Entity>getAll()
	{
		return userRepo.findAll();
	}
}
