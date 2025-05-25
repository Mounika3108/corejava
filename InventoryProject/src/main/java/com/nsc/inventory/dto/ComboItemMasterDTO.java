package com.nsc.inventory.dto;



public class ComboItemMasterDTO {

	    private Long id;     // Could be code, UUID, or DB ID
	    private String name;   // Display name for UI
	    private String type;   // Optional: item type (e.g., 'Asset', 'PackingMaterial', etc.)
        
	   
	    public ComboItemMasterDTO() {
	    }

	    public ComboItemMasterDTO(Long id, String name, String type) {
	        this.id = id;
	        this.name = name;
	        this.type = type;
	    }

	    // Getters and Setters
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
	}



