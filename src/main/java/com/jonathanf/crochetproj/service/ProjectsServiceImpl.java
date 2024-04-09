package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.Projects;
import com.jonathanf.crochetproj.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsServiceImpl implements ProjectsService{

    @Autowired
    private ProjectsRepository projectsRepository;

    @Override
    public Projects saveProject(Projects projects){
        return projectsRepository.save(projects);
    }

    @Override
    public List<Projects> getAllProjects() {
        return  projectsRepository.findAll();
    }
}
