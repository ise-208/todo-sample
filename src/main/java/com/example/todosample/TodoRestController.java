package com.example.todosample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TodoRestController {
    private final TodoRepository todoRepository;

    public TodoRestController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/api/todos")
    public Collection<TodoEntity> getTodos() {
        return todoRepository.findAll();
    }

    @PostMapping("/api/todos")
    public ResponseEntity<?> addTodo(@RequestBody TodoEntity todoEntity) {
        return ResponseEntity.ok().build();
    }


}
