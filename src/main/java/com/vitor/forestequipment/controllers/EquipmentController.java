package com.vitor.forestequipment.controllers;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitor.forestequipment.dtos.EquipmentDto;
import com.vitor.forestequipment.entities.Equipment;
import com.vitor.forestequipment.services.EquipmentService;

@RestController
@RequestMapping(value = "/api/equipment")
public class EquipmentController {

	final EquipmentService equipmentService;
	
	public EquipmentController(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}

	@GetMapping()
	public ResponseEntity<Object> getAllEquipment() {
		return ResponseEntity.status(HttpStatus.OK).body(equipmentService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> EquipmentId(@PathVariable(value = "id") long id) {
		Optional<Equipment> equipmentOptional = equipmentService.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(equipmentOptional.get());
	}

	@PostMapping()
	public ResponseEntity<Object> saveEquipment(@RequestBody EquipmentDto equipmentDto) {
		var equipment = new Equipment();
		BeanUtils.copyProperties(equipmentDto, equipment);
		return ResponseEntity.status(HttpStatus.CREATED).body(equipmentService.save(equipment));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteEquipment(@PathVariable(value = "id")long id) {
		Optional<Equipment> equipmentOptional = equipmentService.findById(id);
		equipmentService.delete(equipmentOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Equipment deleted sucessfully");
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateEquipment(@PathVariable(value = "id")long id,
												  @RequestBody EquipmentDto equipmentDto) {
		  Optional<Equipment> equipmentOptional = equipmentService.findById(id);
	        
	        var equipment = equipmentOptional.get();
	        BeanUtils.copyProperties(equipmentDto, equipment);
	        equipment.setId(equipmentOptional.get().getId());
	        return ResponseEntity.status(HttpStatus.OK).body(equipmentService.save(equipment));
	}

}
