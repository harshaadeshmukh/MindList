package com.example.to_do_list.controller;


import com.example.to_do_list.models.User;
import com.example.to_do_list.services.TaskService;
import com.example.to_do_list.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private UserService userService;

   private User getCurrentUser() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    if (auth == null || 
        !auth.isAuthenticated() || 
        auth.getPrincipal().equals("anonymousUser")) {
        return null;
    }

    return userService.findByUsername(auth.getName()).orElse(null);
}


   @GetMapping("/")
public String index(Model model) {

    User currentUser = getCurrentUser();

    if (currentUser == null) {
        return "redirect:/login";
    }

    model.addAttribute("tasks", taskService.getAllTasksForUser(currentUser));
    model.addAttribute("username", currentUser.getUsername());

    return "index";
}


    @PostMapping("/")
    public String createTask(@RequestParam("title") String title) {
        User currentUser = getCurrentUser();
        if (title != null && !title.trim().isEmpty()) {
            taskService.createTask(title.trim(), currentUser);
        }
        return "redirect:/";
    }

    @PostMapping("/{id}/update")
    public String updateTask(@PathVariable Long id, @RequestParam("title") String title) {
        User currentUser = getCurrentUser();
        if (title != null && !title.trim().isEmpty()) {
            taskService.updateTask(id, title.trim(), currentUser);
        }
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id) {
        User currentUser = getCurrentUser();
        taskService.toggleTask(id, currentUser);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        User currentUser = getCurrentUser();
        taskService.deleteTask(id, currentUser);
        return "redirect:/";
    }
}
