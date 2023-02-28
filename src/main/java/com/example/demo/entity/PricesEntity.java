package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Table(name = "PRICES")
@Getter
@Setter
public class PricesEntity {

    @EmbeddedId
    private PricesEntityId id;

    @Column(name = "brand_id",insertable=false, updatable=false)
    private int brand_id;

    @OneToOne(cascade = CascadeType.ALL,optional=false)
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id", insertable=false, updatable=false)
    private BrandEntity brandEntity;

    /** start date*/
    @Column(name = "start_date",insertable=false, updatable=false)
    private Date start_date;

    /** end date*/
    @Column(name = "end_date")
    private Date end_date;

    /** price list*/
    @Column(name = "price_list")
    private String price_list;

    /** product id*/
    @Column(name = "product_id",insertable=false, updatable=false)
    private String product_id;

    /** priority*/
    @Column(name = "priority")
    private String priority;

    /** currency*/
    @Column(name = "curr")
    private String curr;
}
