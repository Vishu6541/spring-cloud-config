package com.adder.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adder.cotroller.service.AdderService;
import com.adder.feign.FeignClient;

@RestController
@RequestMapping("/adder")
public class AdderController {
	
	@Autowired	
	AdderService as;
	
	@Autowired
	FeignClient feignClient;
	
	@GetMapping("/{num1}/{num2}")
	public int adder(@PathVariable("num1") int num1,@PathVariable("num2") int num2) {
		return num1+num2;
	}
	
	@GetMapping(value = "/string")
	public String adder() {
		return as.adder();
	}
	
	@GetMapping(value = "/feign/test")
	public int feignTest() {
		return feignClient.getSubtractService();
	}
}


