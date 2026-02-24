package com.jk.ChaiBrew.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jk.ChaiBrew.model.registerUser;


@RestController
@RequestMapping("/api/users")
public class HomeController 
{

	@GetMapping("/get")
	public registerUser getUsers()
	{
		registerUser user=new registerUser("Jeevan", "Kumar", "jeevan18@gmail.com","Qwerty18");
		return user;
	}
	
	
}
