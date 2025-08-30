package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.Categories;
import com.example.blog_glow_up.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Integer, Categories> {
}
