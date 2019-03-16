package com.scuticommerce.model.cart;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {

    public String customerId;
    private String id;
    private List<Item> items = new ArrayList<>();
}
