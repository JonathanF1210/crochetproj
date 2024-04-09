package com.jonathanf.crochetproj.Controller;

import com.jonathanf.crochetproj.model.Comments;
import com.jonathanf.crochetproj.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @PostMapping("/add")
    private String add(@RequestBody Comments comments){
        commentsService.saveComment(comments);
        return "Comment was successfully added";
    }

    @GetMapping("/getAll")
    private List<Comments> getAllComments(){
        return commentsService.getAllComments();
    }
}
