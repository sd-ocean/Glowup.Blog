package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.Comments;
import com.example.blog_glow_up.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<Integer, Comments> {
}
