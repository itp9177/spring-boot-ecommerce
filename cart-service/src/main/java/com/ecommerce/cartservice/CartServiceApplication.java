package com.ecommerce.cartservice;

import com.ecommerce.cartservice.config.userIntercepter;
import com.ecommerce.cartservice.services.Auth;
import com.ecommerce.cartservice.services.CartService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@SpringBootApplication
public class CartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
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
	public CartService cartService(){return  new CartService();}
}
