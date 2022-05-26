package com.ecommerce.cartservice.services;


import com.ecommerce.cartservice.VO.Authuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

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
