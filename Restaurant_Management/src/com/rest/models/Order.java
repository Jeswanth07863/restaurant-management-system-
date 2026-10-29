package com.rest.models;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    public enum Status {
        PENDING, PREPARING, READY, COMPLETED
    }

    private final int orderId;
    private final int tableNumber;
    private final List<String> items;
    private final BigDecimal totalAmount;
    private Status status;

    public Order(int orderId, int tableNumber, List<String> items, BigDecimal totalAmount) {
        this.orderId = orderId;
        this.tableNumber = tableNumber;
        this.items = List.copyOf(items);
        this.totalAmount = totalAmount;
        this.status = Status.PENDING;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public List<String> getItems() {
        return items;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId
                + ", Table Number: " + tableNumber
                + ", Items: " + String.join(", ", items)
                + ", Total: " + totalAmount
                + ", Status: " + status;
    }
}
