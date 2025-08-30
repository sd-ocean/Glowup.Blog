package com.example.blog_glow_up.repository;

import com.example.blog_glow_up.entity.Notifications;
import com.example.blog_glow_up.entity.PostAffiliateLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationsRepository extends JpaRepository<Integer, Notifications> {
}
