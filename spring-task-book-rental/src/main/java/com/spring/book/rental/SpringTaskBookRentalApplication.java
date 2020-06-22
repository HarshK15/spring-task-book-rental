package com.spring.book.rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@ComponentScan(basePackages = "com")
@EnableAutoConfiguration
@SpringBootApplication
public class SpringTaskBookRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTaskBookRentalApplication.class, args);
	}

}
