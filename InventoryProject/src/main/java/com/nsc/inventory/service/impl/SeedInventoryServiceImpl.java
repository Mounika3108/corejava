package com.nsc.inventory.service.impl;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nsc.inventory.dto.SeedInventoryDto;
import com.nsc.inventory.entity.SeedInventory;
import com.nsc.inventory.repository.SeedInventoryRepository;
import com.nsc.inventory.service.SeedInventoryService;


@Service
public class SeedInventoryServiceImpl implements SeedInventoryService {

    @Autowired
    private SeedInventoryRepository repository;

    @Override
    public SeedInventoryDto createSeedInventory(SeedInventoryDto dto) {
        SeedInventory entity = new SeedInventory();
        BeanUtils.copyProperties(dto, entity);
        return convertToDTO(repository.save(entity));
    }

    @Override
    public SeedInventoryDto updateSeedInventory(Long id, SeedInventoryDto dto) {
        Optional<SeedInventory> optional = repository.findById(id);
        if (optional.isPresent()) {
            SeedInventory entity = optional.get();
            BeanUtils.copyProperties(dto, entity);
            return convertToDTO(repository.save(entity));
        }
        throw new RuntimeException("SeedInventory not found with id " + id);
    }

    @Override
    public void deleteSeedInventory(Long id) {
        repository.deleteById(id);
    }

    @Override
    public SeedInventoryDto getSeedInventoryById(Long id) {
        return repository.findById(id)
                .map(this::convertToDTO)
                .orElseThrow(() -> new RuntimeException("Not found with id " + id));
    }

    @Override
    public List<SeedInventoryDto> getAllSeedInventories() {
        return repository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    private SeedInventoryDto convertToDTO(SeedInventory entity) {
        SeedInventoryDto dto = new SeedInventoryDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @GetMapping("/seed/{seedId}")
    public List<SeedInventory> findBySeedId(@PathVariable String seedId) {
        return repository.findBySeedId(seedId);
    }

	@Override
	public SeedInventoryDto getBySeedId(String seedId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeedInventoryDto updateSeedInventory1(Long id, SeedInventoryDto dto) {
		// TODO Auto-generated method stub
		return null;
	}
}


