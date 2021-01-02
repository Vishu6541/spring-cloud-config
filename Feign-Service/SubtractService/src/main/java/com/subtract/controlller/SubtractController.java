package com.subtract.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subtract.feign.service.FeignClient;

@RestController
@RequestMapping("/subtract")
public class SubtractController {

	@Value("${subtract-service.num1}")
    private String num1;
	
	@Value("${subtract-service.num2}")
    private String num2;
	
	@Autowired
	FeignClient feignClient;

	@GetMapping("/{num1}/{num2}")
	public int performSubtract(@PathVariable("num1") int num1 ,@PathVariable("num2") int num2) {
		return num1-num2;
	}
	
	@GetMapping()
	public int performByProperties() {
		return Integer.parseInt(num1)-Integer.parseInt(num2);
	}
	
	@GetMapping("/feign/test")
	public String testFeign() {
		return feignClient.adder();
	}
}
