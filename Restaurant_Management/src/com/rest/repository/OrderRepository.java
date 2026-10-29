package com.rest.repository;

import com.rest.models.Order;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private final List<Order> orders = new ArrayList<>();

    public OrderRepository() {
        orders.add(new Order(1, 1, List.of("Burger", "Fries"), new BigDecimal("12.50")));
        orders.add(new Order(2, 2, List.of("Pasta", "Juice"), new BigDecimal("15.50")));
    }

    public List<Order> findAll() {
        return orders;
    }
}
