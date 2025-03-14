package com.cloudrockers.HelloWorldApp.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void helloWorldEndpointReturnsCorrectMessage() {

		ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Hello World!", response.getBody());
	}
	
	

}
