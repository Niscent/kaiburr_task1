package com.nithin.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> findTaskById(String id) {
        return taskRepository.findById(id);
    }

    public Task saveTask(Task task) {
        if (task.getSpecialProperty() == null || task.getSpecialProperty().isEmpty()) {
            task.setSpecialProperty(generateSpecialProperty());
        }
        return taskRepository.save(task);
    }

    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }

    private String generateSpecialProperty() {
        String candidateName = "Kaiburr"; // Replace with the actual candidate name
        StringBuilder propertyValue = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(candidateName.length());
            propertyValue.append(candidateName.charAt(index));
        }
        return propertyValue.toString();
    }

}
