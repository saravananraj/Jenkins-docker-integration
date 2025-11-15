package com.springBoot.DockerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerAppApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome To Docker Deploy Using Jenkins Integration";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerAppApplication.class, args);
	}

}
