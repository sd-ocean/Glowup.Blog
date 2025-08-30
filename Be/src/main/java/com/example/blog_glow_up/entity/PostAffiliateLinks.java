package com.example.blog_glow_up.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post_affiliate_links")
@IdClass(PostAffiliateLinkId.class)
public class PostAffiliateLinks {
    @Id
    @Column(name = "post_id")
    private Integer postId;

    @Id
    @Column(name = "affiliate_link_id")
    private Integer affiliateLinkId;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Posts post;

    @ManyToOne
    @JoinColumn(name = "affiliate_link_id", referencedColumnName = "id", insertable = false, updatable = false)
    private AffiliateLinks affiliateLink;
}