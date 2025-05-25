package com.nsc.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ComboItemMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seed_inventory_id")
	private SeedInventory seedInventory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SeedInventory getSeedInventory() {
		return seedInventory;
	}

	public void setSeedInventory(SeedInventory seedInventory) {
		this.seedInventory = seedInventory;
	}

}
