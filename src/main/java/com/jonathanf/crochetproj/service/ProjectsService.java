package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.Projects;

import java.util.List;

public interface ProjectsService {
    public Projects saveProject(Projects projects);
    public List<Projects> getAllProjects();
}
