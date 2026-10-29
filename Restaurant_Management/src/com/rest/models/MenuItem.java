package com.rest.models;

import java.math.BigDecimal;

public class MenuItem {

    private final int menuItemId;
    private final String name;
    private final String description;
    private final BigDecimal price;
    private final String category;
    private boolean available;

    public MenuItem(int menuItemId, String name, String description, BigDecimal price,
                    String category, boolean available) {
        this.menuItemId = menuItemId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.available = available;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Menu Item ID: " + menuItemId
                + ", Name: " + name
                + ", Description: " + description
                + ", Price: " + price
                + ", Category: " + category
                + ", Available: " + available;
    }
}
