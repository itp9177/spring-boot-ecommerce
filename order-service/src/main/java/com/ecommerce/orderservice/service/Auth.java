package com.ecommerce.orderservice.service;


import com.ecommerce.orderservice.VO.Authuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class Auth {
    @Autowired
    private RestTemplate restTemplate;
    public static Authuser user;
    public static String token;

    public static boolean has(String role){
        return user.getAppUserRoles().contains(role);
    }
    public static Long userId(){
        return user.getId();
    }
}
