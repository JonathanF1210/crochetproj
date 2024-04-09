package com.jonathanf.crochetproj.repository;

import com.jonathanf.crochetproj.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Projects,Long> {
}
