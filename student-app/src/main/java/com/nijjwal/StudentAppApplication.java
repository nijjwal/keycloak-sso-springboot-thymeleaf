package com.nijjwal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@ComponentScan({"com.nijjwal.controller","com.nijjwal.service",""
		+ "com.nijjwal.security"})
@EntityScan("com.nijjwal.entity")
@EnableJpaRepositories("com.nijjwal.repository")
@EnableGlobalMethodSecurity(prePostEnabled = true)

public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}

}
