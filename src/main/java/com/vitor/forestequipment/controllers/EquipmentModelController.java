package com.vitor.forestequipment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitor.forestequipment.entities.EquipmentModel;
import com.vitor.forestequipment.repositories.EquipmentModelRepository;

@RestController
@RequestMapping(value = "/api")
public class EquipmentModelController {

	@Autowired
	EquipmentModelRepository equipmentModelRepository;

	@GetMapping("/equipment/model")
	public List<EquipmentModel> listEquipmentModel() {
		return equipmentModelRepository.findAll();
	}

	@GetMapping("/equipment/model/{id}")
	public EquipmentModel EquipmentModelId(@PathVariable(value = "id") long id) {
		return equipmentModelRepository.findById(id);
	}

	@PostMapping("/equipment/model")
	public EquipmentModel saveEquipmentModel(@RequestBody EquipmentModel equipmentModel) {
		return equipmentModelRepository.save(equipmentModel);
	}

}
