package com.jonathanf.crochetproj.repository;

import com.jonathanf.crochetproj.model.BlogPosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostsRepository extends JpaRepository<BlogPosts,Long> {


}
