package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.Roles;
import com.example.blog_glow_up.entity.Shares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Integer, Roles> {
}
