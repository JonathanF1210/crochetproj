package com.jonathanf.crochetproj.model;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Projects")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Users_UserID")
    private Users owner;

    @Column(length = 45)
    private String title;

    @Column(length = 255)
    private String description;

    @Column(length = 45)
    private String status;

    @Column
    private Timestamp createdAt;

    @Column
    private Timestamp updatedAt;

    @Column(length = 45)
    private String type;

    //Constructor//

    public Projects() {
    }

    //Setters and Getters

    public Long getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(Long projectsId) {
        this.projectsId = projectsId;
    }

    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
