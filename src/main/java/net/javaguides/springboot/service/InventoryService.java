package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Inventory;

public interface InventoryService {
	List<Inventory> getAllInventory();
	void saveInventory(Inventory inventory);
	Inventory getInventoryById(long id);
	void deleteInventoryById(long id);

}