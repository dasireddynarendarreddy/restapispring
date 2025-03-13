package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.nt.repositries")
public class RestApieCommereceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApieCommereceApplication.class, args);
	}

}
