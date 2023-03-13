package com.unitodrive.costumer.service;

import com.unitodrive.costumer.entity.CustomerData;
import com.unitodrive.costumer.repository.CustomerRepository;
import com.unitodrive.dto.CustomerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class CustomerService {

    private CustomerRepository customerRepository; // controllare private


    @Transactional
    public CustomerData createCustomer(CustomerRequestDto customerRequestDto) {

    }
}
