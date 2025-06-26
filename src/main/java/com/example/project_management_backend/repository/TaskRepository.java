package com.example.project_management_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project_management_backend.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
