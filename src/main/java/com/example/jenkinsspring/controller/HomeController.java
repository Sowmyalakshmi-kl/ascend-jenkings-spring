package com.example.jenkinsspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(path ="/home")
	public String home() {
		System.out.println("Welcome to spring home");
		return "Welcome to spring home";
	}
}
