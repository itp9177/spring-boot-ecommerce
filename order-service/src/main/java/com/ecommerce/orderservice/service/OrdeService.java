package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.VO.Cart;
import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.repository.OrderRepository;

public class OrdeService {
    private OrderRepository orderRepository;
    public Order Create(Cart cart){
return orderRepository.findOrderByCartID(cart.getCartId());
    }
}
