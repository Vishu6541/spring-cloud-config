package com.subtract.feign.service;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "adder-service", url = "http://localhost:8080")
public interface FeignClient {

	@GetMapping(value = "/adder/string")
	public String adder();
}
