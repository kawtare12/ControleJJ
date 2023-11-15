package com.elazizi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EntityScan(basePackages = "com.elazizi.entities")
@ComponentScan(basePackages = {"com.elazizi.controllers","com.elazizi.services"})
@EnableJpaRepositories(basePackages = "com.elazizi.repository")
public class ControleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

}
