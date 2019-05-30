package com.example.EasyFinallyProgect.repository;

import com.example.EasyFinallyProgect.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRep extends JpaRepository<Category, Long> {
}
