package com.rest.CLI;

import com.rest.models.OrderItem;
import com.rest.services.OrderItemService;
import java.util.List;

public class OrderItemCLI {

    private final OrderItemService service;

    public OrderItemCLI(OrderItemService service) {
        this.service = service;
    }

    public void displayAllOrderItems() {
        List<OrderItem> orderItems = service.getAllOrderItems();

        System.out.println("\n=== ALL Order Items ===");

        if (orderItems.isEmpty()) {
            System.out.println("No order items found.");
            return;
        }

        for (OrderItem orderItem : orderItems) {
            System.out.println(orderItem);
        }
    }
}
