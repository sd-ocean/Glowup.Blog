package com.example.blog_glow_up.entity;

import java.io.Serializable;
import java.util.Objects;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostAffiliateLinkId implements Serializable {
    private Integer postId;
    private Integer affiliateLinkId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostAffiliateLinkId that = (PostAffiliateLinkId) o;
        return Objects.equals(postId, that.postId) && Objects.equals(affiliateLinkId, that.affiliateLinkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, affiliateLinkId);
    }
}