package com.unitodrive.mechanic.repository;

import com.unitodrive.mechanic.entity.SlotData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<SlotData, Integer> {
}
