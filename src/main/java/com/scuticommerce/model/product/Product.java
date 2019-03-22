package com.scuticommerce.model.product;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {

    @Id
    String id;
    String name;
    String url;
    String image;
    String description;
    String sku;
    String price;
    String salePrice;
    String brand;
    String category;
    String color;
    String size;
    String code;

}
