package com.example.Store.Controler;

import com.example.Store.MarketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class Market {
    private final MarketService marketService;

    public Market(MarketService marketService) {
        this.marketService = marketService;
    }

    @GetMapping("/add")
    public void basket(@RequestParam(value = "num", required = false) Integer productIdentifier,
                       @RequestParam(value = "count", required = false) Integer quantity) {
        marketService.add(productIdentifier, quantity);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getBasket() {
        return marketService.getBasket();
    }
}
