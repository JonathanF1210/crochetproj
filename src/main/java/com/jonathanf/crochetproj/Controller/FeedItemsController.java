package com.jonathanf.crochetproj.Controller;

import com.jonathanf.crochetproj.model.FeedItems;
import com.jonathanf.crochetproj.service.FeedItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feeditem")
public class FeedItemsController {

    @Autowired
    private FeedItemsService feedItemsService;

    @PostMapping("/add")
    private String add(@RequestBody FeedItems feedItems){
        feedItemsService.saveFeedItem(feedItems);
        return "Feed item was successfully added";
    }

    @GetMapping("/getAll")
    private List<FeedItems> getAllFeedItems(){
        return feedItemsService.getAllNewsItems();
    }
}
