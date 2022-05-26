package com.ecommerce.inventoryservice;

import com.ecommerce.inventoryservice.config.userIntercepter;
import com.ecommerce.inventoryservice.repository.InventoryRespository;
import com.ecommerce.inventoryservice.service.Auth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
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

}
