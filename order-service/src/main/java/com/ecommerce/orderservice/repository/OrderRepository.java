package com.ecommerce.orderservice.repository;

import com.ecommerce.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    Order findByOrderID(Long orderId);
    Order findOrderByCartID(Long cartId);
    Order findOrderByUserID(Long userId);
    List<Order> findOrdersByUserID(Long userId);
}
