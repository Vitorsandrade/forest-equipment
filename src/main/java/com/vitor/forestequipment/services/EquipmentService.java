package com.vitor.forestequipment.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.vitor.forestequipment.entities.Equipment;
import com.vitor.forestequipment.repositories.EquipmentRepository;

@Service
public class EquipmentService {
	
	final EquipmentRepository equipmentRepository;
	
	public EquipmentService(EquipmentRepository equipmentRepository) {
		this.equipmentRepository = equipmentRepository;
	}

	@Transactional
	public Equipment save(Equipment equipment) {
		return equipmentRepository.save(equipment);
	}

	public List<Equipment> findAll() {
		return equipmentRepository.findAll();
	}

	public Optional<Equipment> findById(long id) {
		return equipmentRepository.findById(id);
	}

	@Transactional
	public void delete(Equipment equipment) {
		equipmentRepository.delete(equipment);
		
	}

}
