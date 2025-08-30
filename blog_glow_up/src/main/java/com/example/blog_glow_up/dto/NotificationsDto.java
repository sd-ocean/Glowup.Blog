package com.example.blog_glow_up.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationsDto {
    private Integer id;
    private Integer userId;
    private String message;
    private Boolean isRead;
    private Integer status;
}