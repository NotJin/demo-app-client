package com.fai.demoappclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoAppClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppClientApplication.class, args);
	}
	@LoadBalanced
	@Bean
	public RestTemplate geResTemplate(){
		return new RestTemplate();
	}
}
