package com.rest.CLI;

import com.rest.models.MenuItem;
import com.rest.services.MenuItemService;
import java.util.List;

public class MenuItemCLI {

    private final MenuItemService service;

    public MenuItemCLI(MenuItemService service) {
        this.service = service;
    }

    public void displayAllMenuItems() {
        List<MenuItem> menuItems = service.getAllMenuItems();

        System.out.println("\n=== ALL Menu Items ===");

        if (menuItems.isEmpty()) {
            System.out.println("No menu items found.");
            return;
        }

        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }
    }
}
