package com.ecommerce.orderservice.VO;

import com.ecommerce.orderservice.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO {
    private Order order;
    private Cart cart;
}
