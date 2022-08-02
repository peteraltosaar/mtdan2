package com.altocorp.mtdan.controllers;

import com.altocorp.mtdan.domain.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("1", "Get to bed on time"));
        todos.add(new Todo("2", "Have fun"));

        return todos;
    }
}
