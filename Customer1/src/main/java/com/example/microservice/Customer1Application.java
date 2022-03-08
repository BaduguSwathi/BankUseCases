package com.example.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients("com.example.microservice")
@EnableDiscoveryClient
public class Customer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Customer1Application.class, args);
	}
	 @Bean
	  @LoadBalanced
	  public RestTemplate restTemplate() 
	  {
	       return new RestTemplate();
	  }
	
}
