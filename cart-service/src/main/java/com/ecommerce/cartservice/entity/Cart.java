package com.ecommerce.cartservice.entity;

import com.ecommerce.cartservice.VO.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;
    @ElementCollection
    List<Long> productIds;
    @Column(unique = true)
    private Long userId;
}
