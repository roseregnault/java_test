package com.example.demo.dto;

import lombok.Data;

import java.sql.Date;


@Data
public class PricesEntradaDTO {

    /** brand id*/
    private int brand_id;

    /** start date*/
    private Date start_date;

    /** product id*/
    private String product_id;


}
