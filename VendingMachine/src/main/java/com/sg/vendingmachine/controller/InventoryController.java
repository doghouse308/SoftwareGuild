package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.ops.Inventory;

/**
 *
 * @author Paul Peterson
 */
public class InventoryController {

    public void inventory() {

        Inventory inventory = new Inventory();
        inventory.inventoryManager();
 
    }
}
