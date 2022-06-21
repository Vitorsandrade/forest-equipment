package com.vitor.forestequipment.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_EQUIPMENT_STATE")
public class EquipmentState implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String color;
	
	public EquipmentState() {
	}

	public EquipmentState(Long id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	
	
	
	
}
