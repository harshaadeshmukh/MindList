package com.example.to_do_list.services;

import com.example.to_do_list.models.Task;
import com.example.to_do_list.repository.TaskRepository;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private  final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {

        return taskRepository.findAll();
    }

    public void createTask(@NotBlank String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }


    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Task Id"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }



    public void updateTaskTitle(Long id, String title) {

        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Task Not Found"));

        task.setTitle(title);
        taskRepository.save(task);
    }
}
