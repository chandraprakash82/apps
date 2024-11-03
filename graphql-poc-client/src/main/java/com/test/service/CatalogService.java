package com.test.service;

import com.test.client.InventoryClient;
import com.test.dto.Item;
import com.test.dto.ItemRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private InventoryClient inventoryClient;

    public List<Item> viewProducts() {
        return inventoryClient.viewProducts();
    }

    public List<Item> viewProductsByCategory(String category) {
        return inventoryClient.viewProductsByCategory(category);
    }

    public Item receiveNewShipment(ItemRequestDTO itemRequest) {
        return inventoryClient.receiveNewShipment(itemRequest);
    }
}
