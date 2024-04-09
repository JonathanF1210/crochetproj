package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.Comments;

import java.util.List;

public interface CommentsService {
    public Comments saveComment(Comments comments);
    public List<Comments> getAllComments();
}
