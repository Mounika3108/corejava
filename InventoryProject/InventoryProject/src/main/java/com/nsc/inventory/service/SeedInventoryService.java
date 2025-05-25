package com.nsc.inventory.service;



import java.util.List;

import com.nsc.inventory.dto.SeedInventoryDto;

public interface SeedInventoryService {
	SeedInventoryDto createSeedInventory(SeedInventoryDto dto);

	SeedInventoryDto updateSeedInventory(Long id, SeedInventoryDto dto);

	void deleteSeedInventory(Long id);

	SeedInventoryDto getSeedInventoryById(Long id);

	List<SeedInventoryDto> getAllSeedInventories();

	SeedInventoryDto getBySeedId(String seedId);

	SeedInventoryDto updateSeedInventory1(Long id, SeedInventoryDto dto);

	

	
}




