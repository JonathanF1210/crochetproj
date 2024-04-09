package com.jonathanf.crochetproj.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "NewsItems")
public class NewsItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NewsItemID;

    @Column(length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String summary;

    @Column
    private Timestamp publishedAt;

    @Column(length = 255)
    private String URL;

    @Column()
    private Timestamp fetchedAt;

    @Column(length = 45)
    private String Type;

    //Constructor//

    public NewsItems() {
    }

    //Setters and Getters//

    public Long getNewsItemID() {
        return NewsItemID;
    }

    public void setNewsItemID(Long newsItemID) {
        NewsItemID = newsItemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Timestamp getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Timestamp getFetchedAt() {
        return fetchedAt;
    }

    public void setFetchedAt(Timestamp fetchedAt) {
        this.fetchedAt = fetchedAt;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
