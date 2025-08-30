package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.Like;
import com.example.blog_glow_up.entity.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Integer, Like> {
}
