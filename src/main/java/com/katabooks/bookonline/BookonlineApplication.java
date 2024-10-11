package com.katabooks.bookonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @EnableJpaRepositories(basePackages = "com.katabooks.bookonline.repository" )
public class BookonlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookonlineApplication.class, args);
	}

 

}
