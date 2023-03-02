package com.example.demo.repository;


import com.example.demo.entity.PricesEntity;
import com.example.demo.entity.PricesEntityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface PricesDAO extends JpaRepository<PricesEntity, PricesEntityId> {

    /**
     * Query para realizar la consulta.
     *
     * @param brand_id
     * @param start_date
     * @param product_id
     * @return
     */
    @Query(value = "select p.product_id, p.brand_id, p.price, p.start_date, p.end_date, p.curr, p.price_list, p.priority from Prices as p " +
                "join Brand be " +
                "on (p.brand_id=be.brand_id) "+
                "where "+
                "p.brand_id = ?1 " +
                "AND p.start_date = ?2 " +
                "AND p.product_id = ?3 ", nativeQuery = true)
    PricesEntity getTPrices(Integer brand_id,
                                  Date start_date,
                                  String product_id);
}
