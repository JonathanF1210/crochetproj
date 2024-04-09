package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.Tasks;

import java.util.List;

public interface TasksService {
    public Tasks saveTask(Tasks tasks);
    public List<Tasks> getAllTasks();
}
