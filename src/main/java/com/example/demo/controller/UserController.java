package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Entity;
import com.example.demo.service.Services;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	 private Services services;
	@PreAuthorize("hasAuthority('admin')")
	@GetMapping("/name")
	public String get()
	{
		return "akshay";
	}
	//@PreAuthorize("hasAuthority('admin')")
	@GetMapping("/adduser")
	public Entity getName(@RequestBody Entity entity)
	{
		return  services.saveEntity(entity);
	}
	@PreAuthorize("hasAuthority('user')")
	@GetMapping("/getallname")
	public String getNameAll()
	{
		return "akshaynilawar";
	}
	@PreAuthorize("hasAuthority('admin')")
	@GetMapping("/getall")
	public List<Entity> getAll()
	{
		return services.getAll(); 
	}

}
