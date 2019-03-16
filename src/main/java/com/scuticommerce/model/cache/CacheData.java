package com.scuticommerce.model.cache;

import lombok.Data;

@Data
public class CacheData<T> {

    String key;
    T value;
}
