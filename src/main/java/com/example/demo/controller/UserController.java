package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/name")
	public String get()
	{
		return "akshay";
	}
	
	@GetMapping("/getname")
	public String getName()
	{
		return "nilawar";
	}

	@GetMapping("/getallname")
	public String getNameAll()
	{
		return "akshaynilawar";
	}

}
