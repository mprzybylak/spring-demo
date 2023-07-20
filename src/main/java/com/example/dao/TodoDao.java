package com.example.dao;

import com.example.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TodoDao {
    void addNewTodo(Todo todo);
    List<Todo> getAllTodos();
    Todo getTodo(long id);
    Todo updateTodo(long id, Todo todo);
    void deleteTodo(long id);
}
