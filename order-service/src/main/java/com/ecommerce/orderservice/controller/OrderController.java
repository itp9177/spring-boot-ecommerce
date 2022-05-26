package com.ecommerce.orderservice.controller;

import com.ecommerce.orderservice.VO.Cart;
import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private CartService cartService;

    @GetMapping("/show/{id}")
    public Cart getMyCart(@PathVariable Long id) {
        return cartService.getCart(id);
    }

    @PostMapping("/create")
    public Order create(@PathVariable Long id) {
        return new Order();
    }
    @PostMapping("/delete")
public void delete(){

    }
}
