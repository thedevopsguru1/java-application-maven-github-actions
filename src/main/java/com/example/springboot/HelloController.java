package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Welcome to DevOps training school. This is the Java  Maven Project1. If you see this , then all good! ";
	}

}
