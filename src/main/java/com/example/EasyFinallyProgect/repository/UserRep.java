package com.example.EasyFinallyProgect.repository;

import com.example.EasyFinallyProgect.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User, Long> {
}
