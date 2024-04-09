package com.jonathanf.crochetproj.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FeedItems")
public class FeedItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedItemId;

    /*TODO: The ID could be type BlogPost, NewsItems, Projects,
       write logic to be able to be any of these Id's */
    @Column
    private int itemId;

    @Column(length = 45)
    //Could be a blogpost, newsItem, Project//
    private String itemType;

    //Differentiates between user content or platform generated content
    @Column(length = 45)
    private String source;

    @Column(columnDefinition = "TEXT")
    private String description;

    //constructor

    public FeedItems() {
    }

    //Getters and Setters

    public Long getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(Long feedItemId) {
        this.feedItemId = feedItemId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
