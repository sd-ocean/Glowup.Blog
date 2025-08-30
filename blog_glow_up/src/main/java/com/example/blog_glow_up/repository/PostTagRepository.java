package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.PostTag;
import com.example.blog_glow_up.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTagRepository extends JpaRepository<Integer, PostTag> {
}
