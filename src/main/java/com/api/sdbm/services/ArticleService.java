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

    private final ArticleRepository ArticleRepository;

    @Autowired
    public ArticleService(ArticleRepository ArticleRepository) {
        this.ArticleRepository = ArticleRepository;
    }

    public List<Article>

    getAllArticles() {
        return ArticleRepository.findAll();
    }

    public Article getArticleById(Integer id) {
        Optional<Article> optionalArticle = ArticleRepository.findById(id);
        return optionalArticle.orElse(null);
    }

    public Article createArticle(Article Article) {
        return ArticleRepository.save(Article);
    }

    public Article updateArticle(Integer id, Article updatedArticle) {
        Optional<Article> optionalArticle = ArticleRepository.findById(id);
        if (optionalArticle.isPresent()) {
            Article Article = optionalArticle.get();
            // Mise à jour des propriétés de l'Article avec les nouvelles valeurs
            Article.setNomArticle(updatedArticle.getNomArticle());
            Article.setPrixAchat(updatedArticle.getPrixAchat());
            Article.setVolume(updatedArticle.getVolume());
            Article.setTitrage(updatedArticle.getTitrage());
            Article.setIdMarque(updatedArticle.getIdMarque());
            Article.setIdCouleur(updatedArticle.getIdCouleur());
            Article.setIdType(updatedArticle.getIdType());
            return ArticleRepository.save(Article);
        } else {
            // Article non trouvé, retourner null ou lever une exception selon votre logique métier
            return null;
        }
    }

    public void deleteArticle(Integer id) {
        ArticleRepository.deleteById(id);
    }
}
