package com.firstspring.learning.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/user-details")
	public UserDetails userData() {
		return new UserDetails("Pankaj", "Kumar", "Hoshiarpur");
	}
}
