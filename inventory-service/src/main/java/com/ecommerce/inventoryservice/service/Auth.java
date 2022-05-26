package com.ecommerce.inventoryservice.service;


import com.ecommerce.inventoryservice.VO.Authuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class Auth {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    public static Authuser user;
    public static String token;

    public static boolean has(String role){
        return user.getAppUserRoles().contains(role);
    }
    public static Long userId(){
        return user.getId();
    }
}
