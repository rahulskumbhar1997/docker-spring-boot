package com.cloudrockers.HelloWorldApp.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cloudrockers.HelloWorldApp.GreetMessage;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void greetMessageTest() {
		ResponseEntity<GreetMessage> response = restTemplate.getForEntity("/api/greet/Rahul", GreetMessage.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(new GreetMessage("Rahul").getMessage(), response.getBody().getMessage());

	}

}
