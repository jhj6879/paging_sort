package com.example.paging_sort.controller;

import com.example.paging_sort.entity.Article;
import com.example.paging_sort.repository.ArticleRepository;
import com.example.paging_sort.service.ArticleService;
import com.example.paging_sort.viewmodel.ArticleViewmodel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    // 전체 조회
    @GetMapping("/articles")
    public String index(Model model) {
        ArrayList<Article> articleArrayList = (ArrayList<Article>) articleRepository.findAll();
        model.addAttribute("articleList", articleArrayList);
        return "new";
    }

    // 한건 조회
    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model) {
        log.info("id = " + id);
        Article articleEntity = articleRepository.findById(id).orElse(null);
        model.addAttribute("article", articleEntity);
        return "new";
    }
//
//    // 수정 요청
//    @GetMapping("/articles/{id}")
//    public String edit(@PathVariable Long id, Model model) {
//        Article articleEntity = articleRepository.findById(id).orElse(null);
//        model.addAttribute("article", articleEntity);
//        return "new";
//    }
//
//    // 삭제 요청
//    @GetMapping("/articles/delete/{id}")
//    public String delete(@PathVariable Long id, RedirectAttributes rttr) {
//        log.info("삭제 요청이 들어왔습니다!");
//
//        Article target = articleRepository.findById(id).orElse(null);
//        log.info(target.toString());
//
//        if (target != null) {
//            articleRepository.delete(target);
//            rttr.addFlashAttribute("msg", "삭제되었습니다!");
//        }
//
//        return "new";
//    }
}
