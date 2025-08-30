package com.example.blog_glow_up.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post_images")
public class PostImages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private Posts post;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;
}