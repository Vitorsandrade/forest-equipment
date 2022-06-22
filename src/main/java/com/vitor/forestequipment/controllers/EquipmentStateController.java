package com.vitor.forestequipment.controllers;

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

import com.vitor.forestequipment.entities.EquipmentState;
import com.vitor.forestequipment.repositories.EquipmentStateRepository;

@RestController
@RequestMapping(value = "api")
public class EquipmentStateController {

	@Autowired
	EquipmentStateRepository equipmentStateRepository;

	@GetMapping("/equipment/state")
	public List<EquipmentState> listEquipmentState() {
		return equipmentStateRepository.findAll();
	}

	@GetMapping("/equipment/state/{id}")
	public EquipmentState EquipmentStateId(@PathVariable(value = "id") long id) {
		return equipmentStateRepository.findById(id);
	}

	@PostMapping("/equipment/state")
	public EquipmentState saveEquipmentState(@RequestBody EquipmentState equipmentState) {
		return equipmentStateRepository.save(equipmentState);
	}

	@DeleteMapping("/equipment/state")
	public void deleteEquipmentState(@RequestBody EquipmentState equipmentState) {
		equipmentStateRepository.delete(equipmentState);
	}

	@PutMapping("/equipment/state")
	public EquipmentState updateEquipmentState(@RequestBody EquipmentState equipmentState) {
		return equipmentStateRepository.save(equipmentState);
	}
}
