package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		System.out.println("Inside main class");
		SpringApplication.run(DemoProjectApplication.class, args);
	}

}
