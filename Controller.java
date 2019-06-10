package com.microservices.Service_1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Value("${eureka.instance.instance-id}")
	String instance;
	
	@GetMapping(path = "/")
	public String test() {
		return instance;
	}
	
	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello";
	}
	
	
}
