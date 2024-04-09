package com.jonathanf.crochetproj.repository;

import com.jonathanf.crochetproj.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Tasks,Long> {
}
