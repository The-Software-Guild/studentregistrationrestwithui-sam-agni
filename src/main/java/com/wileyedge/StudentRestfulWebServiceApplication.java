package com.wileyedge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.wileyedge")
public class StudentRestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestfulWebServiceApplication.class, args);
	}

}
