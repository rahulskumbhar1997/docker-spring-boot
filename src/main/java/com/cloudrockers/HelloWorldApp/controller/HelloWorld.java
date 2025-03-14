package com.cloudrockers.HelloWorldApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/")
	public String getHelloWorld() {
		return "Hello World!";
	}
	
}
