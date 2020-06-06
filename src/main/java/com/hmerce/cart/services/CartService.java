package com.hmerce.cart.services;

import com.hmerce.cart.dao.CartDao;
import com.hmerce.cart.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    CartDao cartDao;

    public Cart createCart(){
        Cart cart = new Cart();
        cartDao.save(cart);
        return cart;
    }
}
