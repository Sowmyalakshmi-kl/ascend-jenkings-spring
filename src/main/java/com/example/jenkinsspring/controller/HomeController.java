package com.example.jenkinsspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping(path ="/home", produces="text/plain")
	@ResponseBody
	public String home() {
		System.out.println("Welcome to spring home");
		return "Welcome to spring home";
	}
}
