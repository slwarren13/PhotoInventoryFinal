package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Inventory;
import net.javaguides.springboot.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Override 
	public List<Inventory> getAllInventory() {
		return inventoryRepository.findAll();
	}
	
	@Override 
	public void saveInventory(Inventory inventory) {
		this.inventoryRepository.save(inventory);
	}

	@Override
	public Inventory getInventoryById(long id) {
		Optional<Inventory> optional = inventoryRepository.findById(id);
		Inventory inventory = null;
		if(optional.isPresent()) {
			inventory = optional.get();
		} else {
			throw new RuntimeException("Photo id not found in inventory :: " + id);
		}
			return inventory;		
	}

	@Override
	public void deleteInventoryById (long id) {
		this.inventoryRepository.deleteById(id);		
	}
	
	
}
