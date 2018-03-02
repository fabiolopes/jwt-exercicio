package com.bios.jwtme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class JwtMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtMeApplication.class, args);
	}
	
	@RequestMapping("/home")
	public String hello(){
		return "Hello";
	}
}
