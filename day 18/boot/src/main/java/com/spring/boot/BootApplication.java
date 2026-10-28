/*
 * Problem statement:
 * Start a Spring Boot web application so that the Java programs in this
 * package can be opened through a browser on http://localhost:8080.
 *
 * Hint:
 * @SpringBootApplication enables auto-configuration and component scanning.
 * SpringApplication.run(...) starts the embedded web server.
 */
package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
