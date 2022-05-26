
package com.ecommerce.cartservice.config;

import com.ecommerce.cartservice.VO.Authuser;
import com.ecommerce.cartservice.services.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;


@Component
public class userIntercepter implements HandlerInterceptor {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Pre Handle method is Calling");
        String bearerToken = request.getHeader(HttpHeaders.AUTHORIZATION);
        String url = "http://USER-JWT-SERVICE/users/me";
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            bearerToken = bearerToken.substring(7);

            Auth.token=bearerToken;
            HttpHeaders headers = new HttpHeaders();
            headers.setBearerAuth(bearerToken);

            String reob = "{}";
            HttpEntity<String> entity = new HttpEntity<String>(reob, headers);

            try {

                ResponseEntity<Authuser> mysyer = restTemplate.exchange(url, HttpMethod.GET, entity, Authuser.class, 1);
                if (mysyer.hasBody())
                    Auth.user = mysyer.getBody();
                else
                    Auth.user = null;
            } catch (RestClientException e) {
                e.printStackTrace();
                Auth.user=null;
            }
        }
        return true;
    }


}
