package com.example.todosample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "home");
        return "home";
    }
}
