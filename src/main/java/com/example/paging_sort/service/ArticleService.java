package com.example.paging_sort.service;

import com.example.paging_sort.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

}
