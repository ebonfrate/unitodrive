package com.unitodrive.main;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;

public class UnitoDriveApplication {

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to UnitoDrive!";
    }
    public static void main(String[] args) {
        SpringApplication.run(UnitoDriveApplication.class, args);
    }
}
