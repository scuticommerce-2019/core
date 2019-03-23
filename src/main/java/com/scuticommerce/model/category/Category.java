package com.scuticommerce.model.category;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Collection;

@Data
public class Category {

    @Id
    private String id;
    private String code;
    private String name;
    private Category parent;
    private Collection<String> products;
}
