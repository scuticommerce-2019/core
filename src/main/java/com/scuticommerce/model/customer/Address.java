package com.scuticommerce.model.customer;

import lombok.Data;

@Data
public class Address {

    private String id;
    private String number;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
}
