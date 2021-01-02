package com.subtract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients("com.subtract")
public class SubtractServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubtractServiceApplication.class, args);
	}

}
