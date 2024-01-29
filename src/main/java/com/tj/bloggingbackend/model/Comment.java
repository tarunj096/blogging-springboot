package com.tj.bloggingbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.Instant;

@Entity
public class Comment {
    @Id
    private Long id;

    private User user;
    @ManyToOne
    private Article article;

    private String body;

    private Instant createdAt;
    private Instant updatedAt;
}
