package com.scuticommerce.model.customer;

import lombok.Data;

@Data
public class Address {

    private String id;
    private String number;
    private String street;
    private String city;
    private String postalcode;
    private String country;
}
