package com.example.project_management_backend.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.project_management_backend.model.Task;
import com.example.project_management_backend.model.TaskStatus;
import com.example.project_management_backend.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
    
    private final TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task createTask(Task task){
        task.setStatus(TaskStatus.TODO);
        return taskRepository.save(task);
    }
    
}
