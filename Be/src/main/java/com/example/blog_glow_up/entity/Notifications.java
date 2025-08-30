package com.example.blog_glow_up.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notifications")
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "is_read")
    private Boolean isRead = false;
       @Column(name = "status", columnDefinition = "BIT")
    private Integer status = 1;
}