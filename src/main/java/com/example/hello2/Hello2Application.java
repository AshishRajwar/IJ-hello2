package com.example.hello2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hello2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hello2Application.class, args);
	}

	@GetMapping("/hello2")
	public String getHello()  {
		if (true) {
			return "Hello 2";
		} else {
			return "HELLOO 2";
		}
	}

}