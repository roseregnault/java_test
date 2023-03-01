package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
@ToString
public class BrandEntityId implements Serializable {

    private static final long serialVersionUID = -1L;

    private int brand_id;
}
