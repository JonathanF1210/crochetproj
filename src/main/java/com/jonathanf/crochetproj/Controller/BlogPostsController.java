package com.jonathanf.crochetproj.Controller;

import com.jonathanf.crochetproj.model.BlogPosts;
import com.jonathanf.crochetproj.service.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogPostsController {

    @Autowired
    private BlogPostsService blogPostsService;

    @PostMapping("/add")
    public String add(@RequestBody BlogPosts blogPosts){
        blogPostsService.saveBlogPost(blogPosts);
        return "Blog post was successfully added";
    }

    @GetMapping("/getAll")
    private List<BlogPosts> getAllBlogPosts(){
        return blogPostsService.getAllBlogPosts();
    }
}
