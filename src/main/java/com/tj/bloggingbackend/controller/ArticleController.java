package com.tj.bloggingbackend.controller;

import com.tj.bloggingbackend.dto.ArticlePostRequestDto;
import com.tj.bloggingbackend.model.Article;
import com.tj.bloggingbackend.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    ArticleService articleService;
    ArticleController(ArticleService articleService){
      this.articleService = articleService;
    }

    @PostMapping("")
    public ResponseEntity<String> createArticle(@RequestBody ArticlePostRequestDto requestDto){
        var newArticle = articleService.createNewArticle(requestDto);
        return new ResponseEntity<>("Done", HttpStatus.CREATED);
    }

    @PutMapping("")
    public void updateArticle(){

    }

}
