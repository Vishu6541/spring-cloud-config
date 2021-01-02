package com.adder.feign;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "subtract-service", url = "http://localhost:8081")
public interface FeignClient {
	
	@GetMapping(value = "/subtract")
	public int getSubtractService();
	
}
