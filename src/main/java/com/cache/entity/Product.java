package com.cache.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
public class Product implements Serializable {

    private String sku;
    private BigDecimal price;
    private String description;


}
