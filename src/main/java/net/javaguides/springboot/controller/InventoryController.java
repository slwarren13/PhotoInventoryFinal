package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import net.javaguides.springboot.model.Inventory;
import net.javaguides.springboot.service.InventoryService;

@Controller
public class InventoryController {
	
	
	@Autowired
	public InventoryService inventoryService;
	
	@GetMapping
	public String viewHomePage(Model model) {
		model.addAttribute("listInventory", inventoryService.getAllInventory());
		return "index";		
	}
	
	@GetMapping("/images")
	public String viewImages(Model model) {
		return "images";		
	}
	
	@GetMapping("/showNewInventoryForm")
	public String showNewInventoryForm(Model model) {
		Inventory inventory = new Inventory();
		model.addAttribute("inventory", inventory);
		return "new_inventory";
	}
	
	@PostMapping("/saveInventory")
	public String saveInventory(@ModelAttribute("inventory") Inventory inventory) {
		inventoryService.saveInventory(inventory);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value = "id") long id, Model model) {
		Inventory inventory = inventoryService.getInventoryById(id);
		
		model.addAttribute("inventory", inventory);
		return "update_inventory";
	}
	
	@GetMapping("/deleteInventory/{id}")
	public String deleteInventory(@PathVariable (value = "id") long id) {
		this.inventoryService.deleteInventoryById(id);
		return "redirect:/";
	}
	
}

