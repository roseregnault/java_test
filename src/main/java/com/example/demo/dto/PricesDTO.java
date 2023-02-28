package com.example.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PricesDTO {

    /** brand id*/
    private BrandDTO brand_id;

    /** start date*/
    private LocalDateTime start_date;

    /** end date*/
    private LocalDateTime end_date;

    /** price list*/
    private String price_list;

    /** product id*/
    private String product_id;

    /** priority*/
    private String priority;

    /** currency*/
    private String curr;
}
