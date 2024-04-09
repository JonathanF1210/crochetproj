package com.jonathanf.crochetproj.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Projects_ProjectsID")
    private Projects projectId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Projects_Users_UserID")
    private Users userId;

    @Column
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length = 45)
    private String type;

    @Column(length = 45)
    private String status;

    @Column
    private Date deadline;

    //Constructor//
    public Tasks() {
    }

    //Setters and Getters

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Projects getProjectId() {
        return projectId;
    }

    public void setProjectId(Projects projectId) {
        this.projectId = projectId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
