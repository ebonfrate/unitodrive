package com.unitodrive.mechanic.repository;


import com.unitodrive.mechanic.entity.ServiceData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceData, Integer> {
}
