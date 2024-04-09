package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.BlogPosts;
import com.jonathanf.crochetproj.repository.BlogPostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostsServiceImpl implements BlogPostsService{

    @Autowired
    private BlogPostsRepository blogPostsRepository;

    @Override
    public BlogPosts saveBlogPost(BlogPosts blogPosts){
        return blogPostsRepository.save(blogPosts);
    }

    @Override
    public List<BlogPosts> getAllBlogPosts() {
        return blogPostsRepository.findAll();
    }
}
