package com.rest.repository;

import com.rest.models.MenuItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MenuItemRepository {

    private final List<MenuItem> menuItems = new ArrayList<>();

    public MenuItemRepository() {
        menuItems.add(new MenuItem(1, "Burger", "Classic beef burger",
                new BigDecimal("8.50"), "Main Course", true));
        menuItems.add(new MenuItem(2, "Fries", "Crispy potato fries",
                new BigDecimal("4.00"), "Side", true));
        menuItems.add(new MenuItem(3, "Pasta", "Creamy tomato pasta",
                new BigDecimal("12.00"), "Main Course", true));
        menuItems.add(new MenuItem(4, "Juice", "Fresh orange juice",
                new BigDecimal("3.50"), "Drink", false));
    }

    public List<MenuItem> findAll() {
        return menuItems;
    }
}
