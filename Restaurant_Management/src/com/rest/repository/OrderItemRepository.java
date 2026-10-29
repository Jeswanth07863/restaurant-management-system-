package com.rest.repository;

import com.rest.models.OrderItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderItemRepository {

    private final List<OrderItem> orderItems = new ArrayList<>();

    public OrderItemRepository() {
        orderItems.add(new OrderItem(1, 1, 1, 1, new BigDecimal("8.50")));
        orderItems.add(new OrderItem(2, 1, 2, 1, new BigDecimal("4.00")));
        orderItems.add(new OrderItem(3, 2, 3, 1, new BigDecimal("12.00")));
        orderItems.add(new OrderItem(4, 2, 4, 1, new BigDecimal("3.50")));
    }

    public List<OrderItem> findAll() {
        return orderItems;
    }
}
