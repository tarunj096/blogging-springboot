package com.tj.bloggingbackend.controller;

import com.tj.bloggingbackend.model.Article;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @PostMapping("")
    public void createArticle(){

    }

    @PutMapping("")
    public void updateArticle(){

    }

}
