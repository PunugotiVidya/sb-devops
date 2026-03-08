package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDevopsApplication.class, args);
	}

	@GetMapping("/message")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<String>("Hi hello", HttpStatus.OK);

	}

}
