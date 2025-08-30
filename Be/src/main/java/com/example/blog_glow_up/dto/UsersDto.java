package com.example.blog_glow_up.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String role;
    private Integer status;
    private Date dob;
    private String phoneNumber;
    private String avatar;
//    private LocalDateTime createAt;
}
