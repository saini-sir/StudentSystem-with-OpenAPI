package com.rajeshCodes.StudentSystem;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Student System API",
				version = "1.0.0",
				description = "API Documentation for Student Management System"
		),
		servers = {
				@Server(
						url = "http://localhost:8080",
						description = "Local Development Server"
				),
				// Add more servers if applicable
				// e.g., @Server(url = "https://example.com", description = "Production Server")
		}
)
public class StudentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApplication.class, args);
	}
}
