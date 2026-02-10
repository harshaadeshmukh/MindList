package com.example.to_do_list.repository;

import com.example.to_do_list.models.Task;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<@NotNull Task,@NotNull Long> {
}
    