package com.ecommerce.catalog.calatlogservice.services;

import com.ecommerce.catalog.calatlogservice.VO.Authuser;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

public class Auth {
    @Autowired
    private RestTemplate restTemplate;
    public static Authuser user;
    public static String token;

    public static boolean has(String role){
        if(user!=null)
        return user.getAppUserRoles().contains(role);
        else
            return false;
    }
    public static Long userId(){
        return user.getId();
    }

}
