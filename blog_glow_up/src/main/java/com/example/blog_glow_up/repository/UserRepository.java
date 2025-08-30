package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Integer, Users> {
}
