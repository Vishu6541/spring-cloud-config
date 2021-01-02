package com.adder.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("adder-service")
@Getter
@Setter
public class Configuration {
	  private String userName;
	  private String password;

}
