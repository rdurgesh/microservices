package com.soa.training.soatraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.soa.training.soatraining.controller.util.Message;
import com.soa.training.soatraining.services.Implementation;

@RestController
public class DefaultController {

	private Message message;
	
	private Implementation implementationOne;
	
	private Implementation implementationTwo;

	@Autowired
	public DefaultController(Message message, Implementation implementationOne, Implementation implementationTwo) {
		this.message = message;
		this.implementationOne = implementationOne;
		this.implementationTwo = implementationTwo;
	}

	@GetMapping("/hello")
	public String hello() {
		return "Welocme to Spring boot application";
	}

	@GetMapping("/greet/{name}")
	public String welcome(@PathVariable String name) {
		return "Welcome to Spring boot " + message.getText();
	}
	
	@GetMapping("/quilifire1")
	public String displayMessage1(){
		return implementationOne.message();
	}
	
	@GetMapping("/quilifire2")
	public String displayMessage2(){
		return implementationTwo.message();
	}

}
