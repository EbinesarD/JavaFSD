package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String Message() {
		return "Amazon Ec2 instance with SpringBoot Application";
	}

}
