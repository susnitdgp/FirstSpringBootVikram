package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
        
		return "Greetings from Spring Boot!";
	}
	@GetMapping("/index1")
	public String index1() {
		
		return "Greetings from Spring Boot!";
	}

}