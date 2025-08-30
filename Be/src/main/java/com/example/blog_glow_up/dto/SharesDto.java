package com.example.blog_glow_up.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SharesDto {
    private Integer id;
    private Integer userId;
    private Integer postId;
    private String platform;
}