package com.jonathanf.crochetproj.model;

import com.sun.jdi.event.StepEvent;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Users_UserID")
    private Users commentAuthorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BlogPosts_PostID")
    private BlogPosts postId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BlogPosts_author_id")
    private Users BlogAuthorId;

    @Column(columnDefinition = "TEXT")
    private String commentText;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length = 45)
    private String type;

    @Column
    private Timestamp createdAt;

    @Column
    private Timestamp updatedAt;

    //Constructor//
    public Comments() {
    }

    //Getters and Setters//
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Users getCommentAuthorId() {
        return commentAuthorId;
    }

    public void setCommentAuthorId(Users commentAuthorId) {
        this.commentAuthorId = commentAuthorId;
    }

    public BlogPosts getPostId() {
        return postId;
    }

    public void setPostId(BlogPosts postId) {
        this.postId = postId;
    }

    public Users getBlogAuthorId() {
        return BlogAuthorId;
    }

    public void setBlogAuthorId(Users blogAuthorId) {
        BlogAuthorId = blogAuthorId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
