package com.rest.services;

import com.rest.models.Order;
import com.rest.repository.OrderRepository;
import java.util.List;

public class OrderService {

    private final OrderRepository repository;

    public OrderService() {
        repository = new OrderRepository();
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}
