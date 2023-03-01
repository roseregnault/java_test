package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@Embeddable
@ToString
public class PricesEntityId implements Serializable {

    private static final long serialVersionUID = -1L;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    private BrandEntity id;

    /** start date*/
    @Column(name = "start_date")
    private Date start_date;

    /** product id*/
    @Column(name = "product_id", insertable=false, updatable=false)
    private String product_id;


}
