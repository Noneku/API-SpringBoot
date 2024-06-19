package com.api.sdbm.controller;

import com.api.sdbm.model.entity.Article;
import com.api.sdbm.services.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService ArticleService;

    @GetMapping
    public List<Article> getAllArticles() {
        return ArticleService.getAllArticles();
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable("id") Integer id) {
        return ArticleService.getArticleById(id);
    }

    @PostMapping
    public Article createArticle(@RequestBody Article Article) {
        return ArticleService.createArticle(Article);
    }

    @PutMapping("/{id}")
    public Article updateArticle(@PathVariable("id") Integer id, @RequestBody Article Article) {
        return ArticleService.updateArticle(id, Article);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable("id") Integer id) {
        ArticleService.deleteArticle(id);
    }
}
