package com.example.to_do_list.controller;


import com.example.to_do_list.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "logout", required = false) String logout,
                            Model model) {
        System.out.println("=== LOGIN PAGE ACCESSED ===");
        if (error != null) {
            model.addAttribute("error", "Invalid username or password!");
        }
        if (logout != null) {
            model.addAttribute("message", "You have been logged out successfully.");
        }
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(@RequestParam(value = "error", required = false) String error,
                               Model model) {
        System.out.println("=== REGISTER PAGE ACCESSED ===");
        if (error != null) {
            model.addAttribute("error", error);
        }
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("email") String email,
                               @RequestParam("confirmPassword") String confirmPassword,
                               RedirectAttributes redirectAttributes) {

        System.out.println("=== REGISTER FORM SUBMITTED ===");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);

        // Validation
        if (username == null || username.trim().isEmpty()) {
            redirectAttributes.addAttribute("error", "Username cannot be empty");
            return "redirect:/register";
        }

        if (password == null || password.length() < 6) {
            redirectAttributes.addAttribute("error", "Password must be at least 6 characters");
            return "redirect:/register";
        }

        if (!password.equals(confirmPassword)) {
            redirectAttributes.addAttribute("error", "Passwords do not match");
            return "redirect:/register";
        }

        if (email == null || !email.contains("@")) {
            redirectAttributes.addAttribute("error", "Please enter a valid email");
            return "redirect:/register";
        }

        try {
            userService.registerUser(username, password, email);
            redirectAttributes.addFlashAttribute("message", "Registration successful! Please login.");
            System.out.println("=== USER REGISTERED SUCCESSFULLY ===");
            return "redirect:/login";
        } catch (RuntimeException e) {
            System.out.println("=== REGISTRATION ERROR: " + e.getMessage() + " ===");
            redirectAttributes.addAttribute("error", e.getMessage());
            return "redirect:/register";
        }
    }
}