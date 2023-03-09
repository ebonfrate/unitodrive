package com.unitodrive.costumer.repository;

import com.unitodrive.costumer.entity.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerData, Long> {

}
