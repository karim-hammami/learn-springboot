package com.example.learn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn.model.Todo;
import com.example.learn.repository.TodoCollectionRepository;

@RestController
@RequestMapping("/api/todo")
public class todoController {

    @Autowired
    private TodoCollectionRepository repository;

    @PostMapping
    public void create(@RequestBody Todo todo) {
        repository.save(todo);
    }

    @GetMapping
    public List<Todo> findAll() {
        return repository.findAll();
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
