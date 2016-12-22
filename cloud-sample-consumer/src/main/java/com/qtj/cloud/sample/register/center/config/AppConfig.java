package com.qtj.cloud.sample.register.center.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplateLB() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	};

}
