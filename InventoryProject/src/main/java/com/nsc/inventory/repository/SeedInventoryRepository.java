package com.nsc.inventory.repository;


import com.nsc.inventory.entity.SeedInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeedInventoryRepository extends JpaRepository<SeedInventory, Long> {
    List<SeedInventory> findBySeedId(String seedId);
}







