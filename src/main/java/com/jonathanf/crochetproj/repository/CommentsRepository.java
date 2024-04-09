package com.jonathanf.crochetproj.repository;

import com.jonathanf.crochetproj.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments,Long> {
}
