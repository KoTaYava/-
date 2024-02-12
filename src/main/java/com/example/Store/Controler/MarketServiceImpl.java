package com.example.Store.Controler;

import com.example.Store.Basket;
import com.example.Store.MarketService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class MarketServiceImpl implements MarketService {
    public Map<Integer, Integer> basketMap;
    public MarketServiceImpl() {
        this.basketMap = new HashMap<>();
    }

    @Override
    public void add(Integer productIdentifier, Integer quantity) {
        Basket basket = new Basket(productIdentifier, quantity);
        basketMap.put(basket.getProductIdentifier(), basket.getQuantity());
    }

    @Override
    public Map<Integer, Integer> getBasket() {
        return Collections.unmodifiableMap(basketMap);
    }
}
