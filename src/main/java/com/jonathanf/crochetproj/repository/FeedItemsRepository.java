package com.jonathanf.crochetproj.repository;

import com.jonathanf.crochetproj.model.FeedItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedItemsRepository extends JpaRepository<FeedItems,Long> {
}
