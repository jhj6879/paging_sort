package com.example.paging_sort.repository;

import com.example.paging_sort.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
