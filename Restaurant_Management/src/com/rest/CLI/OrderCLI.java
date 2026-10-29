package com.rest.CLI;

import com.rest.models.Order;
import com.rest.services.OrderService;
import java.util.List;

public class OrderCLI {

    private final OrderService service;

    public OrderCLI(OrderService service) {
        this.service = service;
    }

    public void displayAllOrders() {
        List<Order> orders = service.getAllOrders();

        System.out.println("\n=== ALL Orders ===");

        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
