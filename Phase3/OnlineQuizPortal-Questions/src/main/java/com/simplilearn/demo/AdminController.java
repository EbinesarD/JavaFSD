package com.simplilearn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@RequestMapping("/admin")
	public String admin()
	{
		return "Welcome Admin";
	}
}
