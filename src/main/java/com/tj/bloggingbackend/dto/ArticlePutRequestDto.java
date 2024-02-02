package com.tj.bloggingbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticlePutRequestDto {
    private String title;
    private String description;
    private String body;
}
