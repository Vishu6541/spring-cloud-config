package com.adder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.adder")
public class AdderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdderServiceApplication.class, args);
	}

}
