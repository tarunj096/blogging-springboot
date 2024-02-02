package com.tj.bloggingbackend.model;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
    @OneToMany()
    private Set<Article> favoriteArticles;

}
