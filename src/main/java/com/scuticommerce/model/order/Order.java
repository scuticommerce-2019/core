package com.scuticommerce.model.order;

import com.scuticommerce.model.cart.Item;
import com.scuticommerce.model.customer.Address;
import com.scuticommerce.model.customer.Card;
import com.scuticommerce.model.customer.Customer;
import com.scuticommerce.model.shipment.Shipment;
import lombok.Data;

import java.util.Collection;

@Data
public class Order {

    private String id;
    private String customerId;
    private Customer customer;
    private Address address;
    private Card card;
    private Collection<Item> items;
    private Shipment shipment;
    private float total;
}
