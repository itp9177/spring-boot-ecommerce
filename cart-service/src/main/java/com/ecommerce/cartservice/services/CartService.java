package com.ecommerce.cartservice.services;

import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CartService {
    @Autowired
    private CartRepository cartRepository;
    public Cart update(Cart cart){
        if(Auth.has("ROLE_CLIENT")) {
          Cart myCart=  cartRepository.findCartByUserId(cart.getUserId());
          myCart.setProductIds(cart.getProductIds());
        }
        return cartRepository.findCartByCartId(cart.getCartId());
    }
}
