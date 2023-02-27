package com.example.learn.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.learn.model.Todo;

@Repository
public class TodoCollectionRepository {
    private final List<Todo> todoList = new ArrayList<>();

    public TodoCollectionRepository() {
    }

    public List<Todo> findAll() {
        return todoList;
    }

    public void save(Todo todo) {
        todoList.add(todo);
    }
}
