package com.ecommerce.cartservice.controller;

import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.repository.CartRepository;
import com.ecommerce.cartservice.services.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartService cartService;
    @PostMapping("/add")
    public Cart add(@RequestBody Cart cart){
        return cartRepository.save(cart);
    }
    @GetMapping("/")
    public List<Cart> getCart(){
        return cartRepository.findAll();
    }
    @GetMapping("/get/{id}")
    public Cart getCartById(@PathVariable Long id){
        return cartRepository.findCartByCartId(id);
    }
    @PostMapping("/delete")
        public void deleteCart(@RequestBody Long cartId){
         cartRepository.deleteById(cartId);
        }
        @PostMapping("/update")
    public Cart update(@RequestBody Cart cart){
       // cartRepository.findCartByCartId(cart.getCartId()).setProductIds(cart.getProductIds());
      //  return cartRepository.findCartByCartId(cart.getCartId());
            return cartService.update(cart);
        }
}
