package com.api.sdbm.services;

import com.api.sdbm.model.entity.Article;
import com.api.sdbm.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleById(Integer id) {
        Optional<Article> optionalArticle = articleRepository.findById(id);
        return optionalArticle.orElse(null);
    }

    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public Article updateArticle(Integer id, Article updatedArticle) {
        Optional<Article> optionalArticle = articleRepository.findById(id);
        if (optionalArticle.isPresent()) {
            Article article = optionalArticle.get();
            // Mise à jour des propriétés de l'article avec les nouvelles valeurs
            article.setNomArticle(updatedArticle.getNomArticle());
            article.setPrixAchat(updatedArticle.getPrixAchat());
            article.setVolume(updatedArticle.getVolume());
            article.setTitrage(updatedArticle.getTitrage());
            article.setIdMarque(updatedArticle.getIdMarque());
            article.setIdCouleur(updatedArticle.getIdCouleur());
            article.setIdType(updatedArticle.getIdType());
            return articleRepository.save(article);
        } else {
            // Article non trouvé, retourner null ou lever une exception selon votre logique métier
            return null;
        }
    }

    public void deleteArticle(Integer id) {
        articleRepository.deleteById(id);
    }
}
