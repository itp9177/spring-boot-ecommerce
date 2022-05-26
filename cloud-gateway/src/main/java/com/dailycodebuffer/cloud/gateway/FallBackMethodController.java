package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking longer than Expected." +
                " Please try again later";
    }
    @GetMapping("/cartServiceFallBack")
    public String CartServiceFallBackMethod() {
        return "Cart Service is taking longer than Expected." +
                " Please try again later";
    }
    @GetMapping("/catalogServiceFallBack")
    public String CatalogServiceFallBackMethod() {
        return "Catalog Service is taking longer than Expected." +
                " Please try again later";
    }
}
