package com.tj.bloggingbackend.service;

import com.tj.bloggingbackend.dto.ArticlePostRequestDto;
import com.tj.bloggingbackend.model.Article;
import com.tj.bloggingbackend.repository.ArticleRepository;
import org.springframework.stereotype.Service;


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
}
