package com.example.tunisair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication()
@RestController
@ComponentScan(basePackages = {"com.example.tunisair.models", "com.example.tunisair.repositories", "com.example.tunisair.controllers"})
public class TunisairApplication {

	public static void main(String[] args) {
		SpringApplication.run(TunisairApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World";
	}
}
