package com.tj.bloggingbackend.dto;

import com.tj.bloggingbackend.model.Article;
import com.tj.bloggingbackend.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticlePostRequestDto {

    private Long id;
    private String title;
    private String description;
    private String body;

    private User user;

    public Article toArticle() {
        return new Article(id,title,description,body,user);
    }
}
