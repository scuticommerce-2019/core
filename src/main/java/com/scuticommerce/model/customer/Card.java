package com.scuticommerce.model.customer;

import lombok.Data;

@Data
public class Card {

    private String id;
    private String longNum;
    private String expires;
    private String ccv;
}
