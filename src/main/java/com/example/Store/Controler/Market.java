package com.example.Store.Controler;

import com.example.Store.Basket;
import com.example.Store.MarketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class Market {
    private  MarketService marketService;

    public Market(MarketService marketService) {
        this.marketService = marketService;
    }


    @GetMapping("/get")
    public ResponseEntity<Map<Integer,Integer>> getBasket() {
        return new ResponseEntity<>(marketService.getBasketContents(), HttpStatus.OK);

    }
    @GetMapping("/add")
    public ResponseEntity<Map<Integer,Integer>> addProduct(@RequestParam int... ids){
        marketService.addProductToBasket(ids);
        return new ResponseEntity<>(marketService.getBasketContents(), HttpStatus.OK);
    }
    }
