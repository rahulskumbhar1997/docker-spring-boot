package com.cloudrockers.HelloWorldApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cloudrockers.HelloWorldApp.GreetMessage;

@RestController
public class Greet {

	
	@GetMapping("/api/greet/{name}")
	public GreetMessage getGreetingMessage(@PathVariable("name") String name){
		
		return new GreetMessage(name);
		
	}
	
}
