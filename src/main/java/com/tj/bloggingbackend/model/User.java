package com.tj.bloggingbackend.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
    @ManyToMany
    private Set<Article> favoriteArticles = new HashSet<>();

}
