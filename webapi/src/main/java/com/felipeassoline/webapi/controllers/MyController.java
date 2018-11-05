package com.felipeassoline.webapi.controllers;

import com.felipeassoline.customservice.CustomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private CustomService customService;

    public MyController(CustomService customService) {
        this.customService = customService;
    }

    @GetMapping("/")
    public String get() {
        return customService.getValue();
    }

}
