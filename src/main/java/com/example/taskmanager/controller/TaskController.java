package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> findAll(){
        return ResponseEntity.ok().body(taskService.findAllTasks());
    }

    @PostMapping
    public ResponseEntity<?> saveTask(@RequestBody Task task){
        if (task.getDescription() == null & task.getTitle() == null){
            return ResponseEntity.badRequest().body("The tittle and the description can not be null");
        }
        taskService.saveTask(task);
        return ResponseEntity.accepted().build();
    }

}
