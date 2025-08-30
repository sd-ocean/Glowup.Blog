package com.example.blog_glow_up.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostsDto {
    private Integer id;
    private Integer userId;
    private String title;
    private String slug;
    private String content;
    private Integer categoryId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer viewCount;
    private Integer status;
}