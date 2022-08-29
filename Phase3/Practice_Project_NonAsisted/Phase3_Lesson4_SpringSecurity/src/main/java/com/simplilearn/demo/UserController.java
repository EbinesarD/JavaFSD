package com.simplilearn.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {
	@RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello World - Protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello World - Admin";
    }
}
