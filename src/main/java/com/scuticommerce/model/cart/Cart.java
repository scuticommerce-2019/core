package com.scuticommerce.model.cart;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
public class Cart {

    public String customerId;
    private String id;
    private Collection<Item> items;
}
