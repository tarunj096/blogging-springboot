package com.tj.bloggingbackend.dto;

import com.tj.bloggingbackend.model.Article;
import com.tj.bloggingbackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticlePostRequestDto {

    private Long id;
    private String title;
    private String description;
    private String body;
    private Long userId;



    public Article toArticle() {
        return new Article(id,title,description,body,userId,null);
    }
}
