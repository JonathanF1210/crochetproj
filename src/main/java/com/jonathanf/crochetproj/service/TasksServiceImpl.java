package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.Tasks;
import com.jonathanf.crochetproj.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksServiceImpl implements TasksService {

    @Autowired
    private TasksRepository tasksRepository;

    @Override
    public Tasks saveTask(Tasks tasks) {
        return tasksRepository.save(tasks);
    }

    @Override
    public List<Tasks> getAllTasks() {
        return tasksRepository.findAll();
    }
}
