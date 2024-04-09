package com.jonathanf.crochetproj.model;


import jakarta.persistence.*;
import java.util.Set;
import java.sql.Timestamp;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(length = 255, nullable = false)
    private String userName;

    @Column
    private String email;

    @Column
    private String passwordHash;

    @Column(columnDefinition = "TEXT")
    private String bio;

    @ManyToMany
    @JoinTable(
            name = "followers_has_Users", // Name of the join table
            joinColumns = @JoinColumn(name = "Followers_FollowerID"), // Column for the owning side
            inverseJoinColumns = @JoinColumn(name = "Users_UserID") // Column for the inverse side
    )
    private Set<Users> following;

    @ManyToMany(mappedBy = "following")
    private Set<Users> followers;

    @Column
    private Timestamp createdAt;

    @Column
    private Timestamp updatedAt;


    //Constructor//
    public Users() {
    }

    //Setters and Getters//
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
