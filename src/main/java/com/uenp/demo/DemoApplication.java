package com.uenp.demo;

import com.uenp.demo.Models.Entity.User;
import com.uenp.demo.Services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserService userService) {
		return (args) -> {
			User user = new User();
			user.setName("John Doe");
			user.setEmail("john.doe@example.com");
			user.setPassword("password123");
			userService.addUser(user);
		};
	}

}
