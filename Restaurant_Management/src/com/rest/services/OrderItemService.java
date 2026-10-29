package com.rest.services;

import com.rest.models.OrderItem;
import com.rest.repository.OrderItemRepository;
import java.util.List;

public class OrderItemService {

    private final OrderItemRepository repository;

    public OrderItemService() {
        repository = new OrderItemRepository();
    }

    public List<OrderItem> getAllOrderItems() {
        return repository.findAll();
    }
}
