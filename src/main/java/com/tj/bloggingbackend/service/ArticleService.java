package com.tj.bloggingbackend.service;

import com.tj.bloggingbackend.dto.ArticlePostRequestDto;
import com.tj.bloggingbackend.dto.ArticlePutRequestDto;
import com.tj.bloggingbackend.model.Article;
import com.tj.bloggingbackend.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }
    public Article createNewArticle(ArticlePostRequestDto requestDto){
        articleRepository.save(requestDto.toArticle());
        return requestDto.toArticle();
    }

    public Article update(Long id,ArticlePutRequestDto requestDto){
        Optional<Article> optionalArticle = Optional.ofNullable(articleRepository.findArticleByIdIs(id));
        if (!optionalArticle.isPresent()) {
            throw new RuntimeException("Article not found");
        }
        Article updateArticle = optionalArticle.get();
        updateArticle.setTitle(requestDto.getTitle());
        updateArticle.setBody(requestDto.getBody());
        updateArticle.setDescription(requestDto.getDescription());
        articleRepository.save(updateArticle);
        return updateArticle;
    }
}
