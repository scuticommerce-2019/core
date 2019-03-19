package com.scuticommerce.model.category;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Category {

    @Id
    private String id;
    private String code;
    private String name;
    private Category parent;
}
