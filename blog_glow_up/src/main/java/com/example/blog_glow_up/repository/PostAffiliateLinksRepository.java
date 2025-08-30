package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.PostAffiliateLinks;
import com.example.blog_glow_up.entity.PostImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostAffiliateLinksRepository extends JpaRepository<Integer, PostAffiliateLinks> {
}
