package com.scuticommerce.model.product;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Collection;

@Data
public class Product {

    @Id
    String id;
    String name;
    String url;
    String image;
    String description;
    String sku;
    BigDecimal price;
    BigDecimal salePrice;
    String brand;
    Collection<String> categories;
    String color;
    String size;
    String code;

}
