package com.example.Store;

import java.util.Map;

import com.example.Store.Basket;

public interface MarketService {
    Basket getBasket();
    Map<Integer,Integer> getBasketContents();
    void addProductToBasket(int... id);
}

