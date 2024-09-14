package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@Configuration
@SpringBootApplication
public class TourManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourManagementSystemApplication.class, args);
	}
	
	/*
	 * @Bean public PasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 */

}
