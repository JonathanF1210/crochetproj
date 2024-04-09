package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.FeedItems;
import com.jonathanf.crochetproj.repository.FeedItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedItemsServiceImpl implements FeedItemsService{

    @Autowired
    private FeedItemsRepository feedItemsRepository;

    @Override
    public FeedItems saveFeedItem(FeedItems feedItems){
        return feedItemsRepository.save(feedItems);
    }

    @Override
    public List<FeedItems> getAllNewsItems() {
        return feedItemsRepository.findAll();
    }
}
