package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.NewsItems;
import com.jonathanf.crochetproj.repository.NewsItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsItemsServiceImpl implements NewsItemsService{

    @Autowired
    private NewsItemsRepository newsItemsRepository;

    @Override
    public NewsItems saveNewsItem(NewsItems newsItems){
        return newsItemsRepository.save(newsItems);
    }

    @Override
    public List<NewsItems> getAllNewsItems() {
        return newsItemsRepository.findAll();
    }
}
