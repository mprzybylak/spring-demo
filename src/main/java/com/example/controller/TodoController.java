package com.example.controller;

import com.example.model.Todo;
import com.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping("/todos")
    public void newTodo(@RequestBody Todo todo) {
        service.addNewTodo(todo);
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return service.getAllTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable long id) {
        return service.getTodo(id);
    }

    @PutMapping("/todos/{id}")
    public Todo updateTodo(@PathVariable long id, @RequestBody Todo todo) {
        return service.updateTodo(id, todo);
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable long id) {
        service.deleteTodo(id);
    }
}
