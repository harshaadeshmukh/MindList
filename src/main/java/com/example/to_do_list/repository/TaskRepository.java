package com.example.to_do_list.repository;

import com.example.to_do_list.models.Task;
import com.example.to_do_list.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser(User user);

    List<Task> findByUserOrderByIdAsc(User user);

    Optional<Task> findByIdAndUser(Long id, User user);
}