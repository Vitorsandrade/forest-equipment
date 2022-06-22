package com.vitor.forestequipment.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.forestequipment.entities.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

	Optional<Equipment> findById(long id);

}
