package com.vitor.forestequipment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.forestequipment.entities.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

	Equipment findById(long id);

}
