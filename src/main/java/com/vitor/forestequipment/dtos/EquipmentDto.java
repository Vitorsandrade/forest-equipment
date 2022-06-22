package com.vitor.forestequipment.dtos;

import com.vitor.forestequipment.entities.EquipmentModel;

public class EquipmentDto {

	private String name;
	private EquipmentModel model;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EquipmentModel getModel() {
		return model;
	}
	public void setModel(EquipmentModel model) {
		this.model = model;
	}
	
	
}
