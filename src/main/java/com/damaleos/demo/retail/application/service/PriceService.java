package com.damaleos.demo.retail.application.service;

import com.damaleos.demo.retail.domain.model.Price;
import com.damaleos.demo.retail.infrastructure.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    private final PriceRepository priceRepository;

    @Autowired
    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

    public Price getPriceById(Long id) {
        return priceRepository.findById(id).orElse(null);
    }

    public Price createPrice(Price price){
        return priceRepository.save(price);
    }

}
