package com.hmerce.cart.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/cart")
@RestController
public class CartController {


    @GetMapping
    public String getCart(){
        return "Hello";
    }
}
