package com.example.to_do_list.services;

import com.example.to_do_list.models.Task;
import com.example.to_do_list.models.User;
import com.example.to_do_list.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasksForUser(User user) {
        return taskRepository.findByUserOrderByIdAsc(user);
    }

    public Task createTask(String title, User user) {
        Task task = new Task(title, user);
        return taskRepository.save(task);
    }

    public Optional<Task> getTaskByIdAndUser(Long id, User user) {
        return taskRepository.findByIdAndUser(id, user);
    }

    public Task updateTask(Long id, String newTitle, User user) {
        Task task = taskRepository.findByIdAndUser(id, user)
                .orElseThrow(() -> new RuntimeException("Task not found or unauthorized"));
        task.setTitle(newTitle);
        return taskRepository.save(task);
    }

    public Task toggleTask(Long id, User user) {
        Task task = taskRepository.findByIdAndUser(id, user)
                .orElseThrow(() -> new RuntimeException("Task not found or unauthorized"));
        task.setCompleted(!task.isCompleted());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id, User user) {
        Task task = taskRepository.findByIdAndUser(id, user)
                .orElseThrow(() -> new RuntimeException("Task not found or unauthorized"));
        taskRepository.delete(task);
    }
}