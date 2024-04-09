package com.jonathanf.crochetproj.Controller;

import com.jonathanf.crochetproj.model.NewsItems;
import com.jonathanf.crochetproj.service.NewsItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newsitem")
public class NewsItemsController {

    @Autowired
    private NewsItemsService newsItemsService;

    @PostMapping("/add")
    private String add(@RequestBody NewsItems newsItems){
        newsItemsService.saveNewsItem(newsItems);
        return "News item was successfully added";
    }

    @GetMapping("/getAll")
    private List<NewsItems> getAllNewsItems(){
        return newsItemsService.getAllNewsItems();
    }
}
