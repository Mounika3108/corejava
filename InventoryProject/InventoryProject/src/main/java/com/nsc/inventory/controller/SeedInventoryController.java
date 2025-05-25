package com.nsc.inventory.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsc.inventory.dto.SeedInventoryDto;
import com.nsc.inventory.service.SeedInventoryService;




@RestController
@RequestMapping("/api/seed-inventory")
public class SeedInventoryController {

	@Autowired
	private SeedInventoryService service;

	@PostMapping
	public SeedInventoryDto create(@RequestBody SeedInventoryDto dto) {
		return service.createSeedInventory(dto);
	}

	@PutMapping("/{id}")
	public SeedInventoryDto update(@PathVariable Long id, @RequestBody SeedInventoryDto dto) {
		return service.updateSeedInventory(id, dto);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteSeedInventory(id);
	}

	@GetMapping("/{id}")
	public SeedInventoryDto getById(@PathVariable Long id) {
		return service.getSeedInventoryById(id);
	}

	@GetMapping
	public List<SeedInventoryDto> getAll() {
		return service.getAllSeedInventories();
	}

	
}

