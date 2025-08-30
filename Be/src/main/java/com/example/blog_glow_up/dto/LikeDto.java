package com.example.blog_glow_up.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LikeDto {
    private Integer userId;
    private Integer postId;
    private LocalDateTime createdAt;
}