package com.hmerce.cart.api;


import com.hmerce.cart.model.Cart;
import com.hmerce.cart.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/cart")
@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping
    public Cart getCart(){
        return cartService.createCart();
    }
}
