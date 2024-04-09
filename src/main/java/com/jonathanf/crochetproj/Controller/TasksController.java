package com.jonathanf.crochetproj.Controller;

import com.jonathanf.crochetproj.model.Tasks;
import com.jonathanf.crochetproj.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TasksController {

    @Autowired
    private TasksService tasksService;

    @PostMapping("/add")
    private String add(@RequestBody Tasks tasks){
        tasksService.saveTask(tasks);
        return "Task was successfully added";
    }

    @GetMapping("/getAll")
    private List<Tasks> getAllTasks(){
        return tasksService.getAllTasks();
    }
}
