package com.example.demo;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Habit66Application {

	public static void main(String[] args) {
		SpringApplication.run(Habit66Application.class, args);
	}

	@GetMapping("/")
	public List<String> hello() {
		return List.of("Hello", "World!");
	}

}
