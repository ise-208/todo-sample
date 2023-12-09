package com.example.todosample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("todoEntity", new TodoEntity());
        return "home";
    }

    @PostMapping("/api/home")
    public String addTodo(@ModelAttribute TodoEntity todoEntity) {
        todoRepository.insert(todoEntity);
        return "redirect:/home";
    }
}
