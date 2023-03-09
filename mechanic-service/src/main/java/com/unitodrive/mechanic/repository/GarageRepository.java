package com.unitodrive.mechanic.repository;

import com.unitodrive.mechanic.entity.GarageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarageRepository extends JpaRepository<GarageData, Integer> {
}
