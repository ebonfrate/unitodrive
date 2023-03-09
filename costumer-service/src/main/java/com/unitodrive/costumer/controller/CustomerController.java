package com.unitodrive.costumer.controller;

import com.unitodrive.costumer.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService() {
        return null;
    }
}
