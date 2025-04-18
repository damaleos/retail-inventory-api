package com.damaleos.demo.retail.infrastructure.repository;

import com.damaleos.demo.retail.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

}
