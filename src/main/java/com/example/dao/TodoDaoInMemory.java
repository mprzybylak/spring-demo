package com.example.dao;

import com.example.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TodoDaoInMemory implements TodoDao {

    private final AtomicLong idGenerator = new AtomicLong();
    private final Map<Long, Todo> todos = new HashMap<>();

    @Override
    public void addNewTodo(Todo todo) {
        long id = idGenerator.getAndIncrement();
        todos.put(id, todo.setId(id));
    }

    @Override
    public List<Todo> getAllTodos() {
        return new ArrayList<>(todos.values());
    }

    @Override
    public Todo getTodo(long id) {
        return todos.get(id);
    }

    @Override
    public Todo updateTodo(long id, Todo todo) {
        return todos.replace(id, todo.setId(id));
    }

    @Override
    public void deleteTodo(long id) {
        todos.remove(id);
    }
}
