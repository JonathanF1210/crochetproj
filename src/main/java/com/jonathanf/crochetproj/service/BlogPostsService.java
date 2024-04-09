package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.BlogPosts;

import java.util.List;

public interface BlogPostsService {
    public BlogPosts saveBlogPost(BlogPosts blogPosts);
    public List<BlogPosts> getAllBlogPosts();
}
