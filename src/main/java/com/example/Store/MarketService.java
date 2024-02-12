package com.example.Store;

import java.util.Map;

public interface MarketService {
    void add(Integer productIdentifier,Integer quantity);

    Map<Integer, Integer> getBasket();

}
