package com.example.todosample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/home")
    public String home(Model model) {
        Collection<TodoEntity> todos = todoRepository.findAll();
        model.addAttribute("todos",todos);
        model.addAttribute("todoEntity", new TodoEntity());
        return "home";
    }

    @PostMapping("/home")
    public String addTodo(@ModelAttribute TodoEntity todoEntity) {
        todoRepository.insert(todoEntity);
        return "redirect:/home";
    }
}
