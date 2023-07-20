package com.example.service;

import com.example.dao.TodoDao;
import com.example.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao dao;

    @Override
    public void addNewTodo(Todo todo) {
        dao.addNewTodo(todo);
    }

    @Override
    public List<Todo> getAllTodos() {
        return dao.getAllTodos();
    }

    @Override
    public Todo getTodo(long id) {
        return dao.getTodo(id);
    }

    @Override
    public Todo updateTodo(long id, Todo todo) {
        return dao.updateTodo(id, todo);
    }

    @Override
    public void deleteTodo(long id) {
        dao.deleteTodo(id);
    }
}
