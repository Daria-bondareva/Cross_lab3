package com.bondareva.tasks;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TasksController {
    @GetMapping
    public String tasks(Model model) {
        return "tasks/list";
    }
}
