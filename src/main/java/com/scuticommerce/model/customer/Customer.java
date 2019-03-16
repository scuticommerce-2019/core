package com.scuticommerce.model.customer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private List<Address> addresses = new ArrayList<>();
    private List<Card> cards = new ArrayList<>();
}
