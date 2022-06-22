package com.vitor.forestequipment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitor.forestequipment.entities.Equipment;
import com.vitor.forestequipment.repositories.EquipmentRepository;

@RestController
@RequestMapping(value="/api")
public class EquipmentController {

	@Autowired
	EquipmentRepository equipmentRepository;
	
	
	@GetMapping("/equipment")
	public List<Equipment> listEquipments(){
		return equipmentRepository.findAll();
	}
	
	@GetMapping("/equipment/{id}")
	public Equipment EquipmentId(@PathVariable(value="id") long id){
		return equipmentRepository.findById(id);
	}
	
	@PostMapping("/equipment")
	public Equipment saveEquipment(@RequestBody Equipment equipment) {
		return equipmentRepository.save(equipment);
	}
	
}
