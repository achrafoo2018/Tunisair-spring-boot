package com.example.tunisair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class TunisairApplication {

	public static void main(String[] args) {
		SpringApplication.run(TunisairApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World";
	}
}
