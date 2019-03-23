package com.scuticommerce.model.cart;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
public class Item {

    private String id;
    private String itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
}
