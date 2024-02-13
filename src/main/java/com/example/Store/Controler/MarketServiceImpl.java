package com.example.Store.Controler;

import com.example.Store.Basket;
import com.example.Store.MarketService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class MarketServiceImpl implements MarketService {
    private Basket basket;
    public MarketServiceImpl(Basket basket) {
        this.basket = basket;
    }


    @Override
    public Basket getBasket() {
        return basket;
    }

    @Override
    public Map<Integer, Integer> getBasketContents() {
        return basket.getContents();
    }

    @Override
    public void addProductToBasket(int... ids) {
        Arrays.stream(ids).forEach(id->basket.add(id));

    }
}

