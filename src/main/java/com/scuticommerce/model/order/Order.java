package com.scuticommerce.model.order;

import com.scuticommerce.model.customer.Address;
import com.scuticommerce.model.customer.Card;
import com.scuticommerce.model.customer.Customer;
import com.scuticommerce.model.shipment.Shipment;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;


@Data
public class Order {

    String id;
    String customerId;
    Customer customer;
    Address address;
    Card card;
    Collection<OrderItem> items;
    Shipment shipment;
    String email;
    String orderNumber;
    String dateEntered;
    BigDecimal orderTotal;
    BigDecimal itemTotal;
    BigDecimal taxTotal;
    BigDecimal shippingTotal;
    BigDecimal handlingTotal;
    String status;
    Date shipDate;
    String trackingNumber;
    String shippingMethod;
    String couponCode;
    BigDecimal discountTotal;
}
