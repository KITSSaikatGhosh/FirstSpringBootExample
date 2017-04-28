package com.kf.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@RequestMapping("/sayHello")
	public String welcome() {
		return "Hi User!!! Welcome to First Spring Boot Rest Docker Application";
	}
	
	@GetMapping("/sayDover")
	public String getDover() {
		return "Hi User!!! Thanks for Visiting Docker Dover Square";
	}
}
