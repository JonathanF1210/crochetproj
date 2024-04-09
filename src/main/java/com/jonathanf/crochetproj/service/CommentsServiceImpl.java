package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.Comments;
import com.jonathanf.crochetproj.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService{

    @Autowired
    private CommentsRepository commentsRepository;

    @Override
    public Comments saveComment(Comments comments){
        return commentsRepository.save(comments);
    }

    @Override
    public List<Comments> getAllComments() {
        return commentsRepository.findAll();
    }
}
