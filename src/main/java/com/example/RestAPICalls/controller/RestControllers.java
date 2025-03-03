package com.example.RestAPICalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Bridgelabz!";
    }
}
