package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.FeedItems;

import java.util.List;

public interface FeedItemsService {
    public FeedItems saveFeedItem(FeedItems feedItems);
    public List<FeedItems> getAllNewsItems();
}
