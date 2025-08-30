package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.AffiliateLinks;
import com.example.blog_glow_up.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliateLinksRepository extends JpaRepository<Integer, AffiliateLinks> {
}
