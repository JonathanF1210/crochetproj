package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.NewsItems;

import java.util.List;

public interface NewsItemsService {
    public NewsItems saveNewsItem(NewsItems newsItems);
    public List<NewsItems> getAllNewsItems();
}
