package com.rest.models;

import java.math.BigDecimal;

public class OrderItem {

    private final int orderItemId;
    private final int orderId;
    private final int menuItemId;
    private final int quantity;
    private final BigDecimal unitPrice;

    public OrderItem(int orderItemId, int orderId, int menuItemId, int quantity,
                     BigDecimal unitPrice) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.menuItemId = menuItemId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public BigDecimal getLineTotal() {
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }

    @Override
    public String toString() {
        return "Order Item ID: " + orderItemId
                + ", Order ID: " + orderId
                + ", Menu Item ID: " + menuItemId
                + ", Quantity: " + quantity
                + ", Unit Price: " + unitPrice
                + ", Line Total: " + getLineTotal();
    }
}
