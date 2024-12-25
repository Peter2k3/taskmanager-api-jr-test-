package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void saveTask(Task task){
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTaskById(Integer idTask){ taskRepository.deleteById(idTask);}

    public List<Task> findAllTasks(){ return taskRepository.findAll(); }

    public void markTask(Integer idTask){
        Optional<Task> task = taskRepository.findById(idTask);

        task.ifPresent(value -> value.setCompleted(true));
    }
}
