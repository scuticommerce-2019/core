package com.scuticommerce.model.cart;

import lombok.Data;

@Data
public class Item {

    private String id;
    private String itemId;
    private Integer quantity;
    private Float unitPrice;
}
