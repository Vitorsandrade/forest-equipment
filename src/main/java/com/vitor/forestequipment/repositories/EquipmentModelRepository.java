package com.vitor.forestequipment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.forestequipment.entities.EquipmentModel;

public interface EquipmentModelRepository extends JpaRepository<EquipmentModel, Long> {

	EquipmentModel findById(long id);

}
