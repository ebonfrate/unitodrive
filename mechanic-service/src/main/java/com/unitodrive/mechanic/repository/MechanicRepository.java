package com.unitodrive.mechanic.repository;

import com.unitodrive.mechanic.entity.MechanicData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MechanicRepository extends JpaRepository<MechanicData, Integer> {
}
