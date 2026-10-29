package com.rest.services;

import com.rest.models.MenuItem;
import com.rest.repository.MenuItemRepository;
import java.util.List;

public class MenuItemService {

    private final MenuItemRepository repository;

    public MenuItemService() {
        repository = new MenuItemRepository();
    }

    public List<MenuItem> getAllMenuItems() {
        return repository.findAll();
    }
}
