package com.learning.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		//redirect o forward (Forward no cambia los metodos del controlador)
		return "forward:/app/index";
	}

}
