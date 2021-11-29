package com.springboot.app.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceApplication.class, args);
	}

}
