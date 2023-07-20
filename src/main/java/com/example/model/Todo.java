package com.example.model;

public class Todo {

    private final Long id;
    private final String title;
    private final Boolean done;

    public Todo(Long id, String title, Boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getDone() {
        return done;
    }

    public Todo setId(long id) {
        return new Todo(id, this.title, this.done);
    }
}
