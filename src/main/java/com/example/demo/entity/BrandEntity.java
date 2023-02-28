package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "BRAND")
@Getter
@Setter
public class BrandEntity {

    @EmbeddedId
    private BrandEntityId brand_id;

    @Column(name = "brand_description")
    private String brand_description;

}
