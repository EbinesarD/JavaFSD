package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class Phase3Lesson2UserFeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3Lesson2UserFeedbackApplication.class, args);
	}

}