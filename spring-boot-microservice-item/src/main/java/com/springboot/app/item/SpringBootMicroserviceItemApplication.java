package com.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@RibbonClient(name="servicios-productos")
@EnableFeignClients
@SpringBootApplication
public class SpringBootMicroserviceItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceItemApplication.class, args);
	}

}
