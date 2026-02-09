package com.example.to_do_list.controller;
import com.example.to_do_list.models.Task;
import com.example.to_do_list.services.TaskService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model)
    {
        List<Task> taskList = taskService.getAllTasks();
        model.addAttribute("tasks" , taskList);
        return "tasks";
    }


    @PostMapping
    public String createTask(@RequestParam @NotBlank String title)
    {
       taskService.createTask(title);
       return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id)
    {
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id)
    {
        taskService.toggleTask(id);
        return "redirect:/";
    }

    @PostMapping("/{id}/update")
    public String updateTaskTitle(@PathVariable Long id,
                                  @RequestParam String title) {
        taskService.updateTaskTitle(id, title);
        return "redirect:/";
    }



}
