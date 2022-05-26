package com.ecommerce.orderservice;

import com.ecommerce.orderservice.config.userIntercepter;
import com.ecommerce.orderservice.repository.OrderRepository;
import com.ecommerce.orderservice.service.Auth;
import com.ecommerce.orderservice.service.CartService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
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
	public CartService cartService(){return new CartService();}


}
