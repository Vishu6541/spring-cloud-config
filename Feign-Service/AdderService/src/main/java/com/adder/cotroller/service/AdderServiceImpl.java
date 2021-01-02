package com.adder.cotroller.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AdderServiceImpl implements AdderService {

	@Value("${adder-service.userName}")
    private String user;
	
	@Value("${adder-service.password}")
    private String password;

	@Override
	public String adder() {
		return user+password;
	}
	 
}
