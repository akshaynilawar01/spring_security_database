package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Entity;
//import com.example.demo.model.Role;
@Repository
public interface UserRepo extends JpaRepository<Entity, Integer> {
	

	public Entity findByEmail(String email);	
	

}
