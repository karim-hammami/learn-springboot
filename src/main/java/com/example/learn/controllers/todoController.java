package com.example.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class todoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
