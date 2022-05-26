package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.VO.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class CartService {
    @Autowired
    private RestTemplate restTemplate;
    public Cart getCart(Long cartId){
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(Auth.token);

        String reob = "{}";
        HttpEntity<String> entity = new HttpEntity<String>(reob, headers);
        String url = "http://CART-SERVICE/cart/get/"+cartId;
        try {
            ResponseEntity<Cart> cart = restTemplate.exchange(url, HttpMethod.GET, entity, Cart.class, 1);
            return cart.getBody();
        } catch (RestClientException e) {
            e.printStackTrace();

        }
        return new Cart();
    }
}
