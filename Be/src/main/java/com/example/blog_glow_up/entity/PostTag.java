package com.example.blog_glow_up.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post_tags")
@IdClass(PostTagId.class)
public class PostTag {
    @Id
    @Column(name = "post_id")
    private Integer postId;

    @Id
    @Column(name = "tag_id")
    private Integer tagId;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Posts post;

    @ManyToOne
    @JoinColumn(name = "tag_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Tags tag;
}