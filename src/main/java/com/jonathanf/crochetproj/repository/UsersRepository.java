package com.jonathanf.crochetproj.repository;

import com.jonathanf.crochetproj.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
