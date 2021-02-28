package com.app.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.security.dao.User;
import com.app.security.repository.UserRepository;
@RestController
@RequestMapping("/data")
public class SyHomeController  {

	@Autowired
	UserRepository repo;
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	@CrossOrigin
	 @PostMapping("/insertdata")
	 	public User create1(@RequestBody User user)
	 	{
	    	 
	 	return repo.save(user);
	 	}

	


}
