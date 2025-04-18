package com.damaleos.demo.retail.infrastructure.controller;

import com.damaleos.demo.retail.application.service.PriceService;
import com.damaleos.demo.retail.domain.model.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    private final PriceService priceService;

    @Autowired
    public ApplicationController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/prices")
    public List<Price> getAllPrices() {
        return priceService.getAllPrices();
    }

    @GetMapping("/prices/{id}")
    public Price getPriceById(@PathVariable Long id) {
        return priceService.getPriceById(id);
    }

    @PostMapping("/prices")
    public Price createPrice(@RequestBody Price price){
        return priceService.createPrice(price);
    }

    @GetMapping("/applicablePrice")
    public Price getApplicablePrice (@RequestParam LocalDateTime dateTime, @RequestParam int brandId, @RequestParam int productId) {
        return priceService.findApplicablePrice(dateTime, brandId, productId);
    }
}
