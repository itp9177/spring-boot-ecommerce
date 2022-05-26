package com.ecommerce.catalog.calatlogservice;

import com.ecommerce.catalog.calatlogservice.config.userIntercepter;
import com.ecommerce.catalog.calatlogservice.services.Auth;
import com.ecommerce.catalog.calatlogservice.services.CategoryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class CalatlogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalatlogServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public Auth auth(){
		return new Auth();
	}
	@Bean
	public userIntercepter userintercepter(){return new userIntercepter();}
	@Bean
	public CategoryService categoryService(){return new CategoryService();}
}
