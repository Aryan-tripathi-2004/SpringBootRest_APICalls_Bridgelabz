package com.example.RestAPICalls.controller;

import com.example.RestAPICalls.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllers {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Bridgelabz!";
    }

    @GetMapping("/hello/query")
    public String hello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    @PostMapping("/hello/post")
    public String hello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}
