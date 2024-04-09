package com.jonathanf.crochetproj.Controller;

import com.jonathanf.crochetproj.model.Projects;
import com.jonathanf.crochetproj.model.Tasks;
import com.jonathanf.crochetproj.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectsController {

    @Autowired
    private ProjectsService projectsService;

    @PostMapping("/add")
    private String add(@RequestBody Projects projects){
        projectsService.saveProject(projects);
        return "Project was successfully added";
    }

    @GetMapping("/getAll")
    private List<Projects> getAllTasks(){
        return projectsService.getAllProjects();
    }
}
