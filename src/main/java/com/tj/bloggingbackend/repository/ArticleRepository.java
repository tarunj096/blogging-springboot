package com.tj.bloggingbackend.repository;

import com.tj.bloggingbackend.model.Article;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface ArticleRepository extends Repository<Article, Long> {
    Article save(Article article);

    Article findArticleByIdIs(Long id);
}
