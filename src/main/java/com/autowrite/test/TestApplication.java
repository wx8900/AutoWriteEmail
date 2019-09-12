package com.autowrite.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jack
 *
 * 1. Spring Boot requires to set up application-test.yml
 * 2. Add parameter spring.profiles.active=test for TestApplication class
 */
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
