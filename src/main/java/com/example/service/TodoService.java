package com.example.service;

import com.example.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TodoService {

    void addNewTodo(Todo todo);
    List<Todo> getAllTodos();
    Todo getTodo(long id);
    Todo updateTodo(long id, Todo todo);
    void deleteTodo(long id);

}
