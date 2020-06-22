package com.spring.book.rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import sun.misc.Contended;

@ComponentScan(basePackages = "com")
@EnableAutoConfiguration
@SpringBootApplication
public class SpringTaskBookRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTaskBookRentalApplication.class, args);
	}

}
