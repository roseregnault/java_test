package com.example.demo.repository;

import com.example.demo.dto.PricesEntradaDTO;
import com.example.demo.entity.PricesEntity;
import com.example.demo.entity.PricesEntityId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PricesDAO extends JpaRepository<PricesEntity, PricesEntityId> {

   // List<PricesEntity> findById(BrandDTO brand_id);


    List<PricesEntity> findByid(PricesEntradaDTO brand_id);
}
