package com.unitodrive.costumer.controller;

import com.unitodrive.costumer.entity.CustomerData;
import com.unitodrive.costumer.repository.CustomerRepository;
import com.unitodrive.costumer.service.CustomerService;
import com.unitodrive.dto.CustomerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @PostMapping("/create")
    public CustomerData createCustomer(@RequestBody CustomerRequestDto customerRequestDto) {
        return customerService.createCustomer(customerRequestDto);
    }




}
