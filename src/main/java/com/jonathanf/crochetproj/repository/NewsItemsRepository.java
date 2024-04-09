package com.jonathanf.crochetproj.repository;

import com.jonathanf.crochetproj.model.NewsItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsItemsRepository extends JpaRepository<NewsItems,Long> {
}
