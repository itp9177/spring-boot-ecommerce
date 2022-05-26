package com.ecommerce.cartservice.repository;

import com.ecommerce.cartservice.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    Cart findCartByCartId(Long cartId);
    Cart findCartByUserId(Long userId);

}
