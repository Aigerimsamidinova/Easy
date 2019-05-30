package com.example.EasyFinallyProgect.repository;

import com.example.EasyFinallyProgect.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRep extends JpaRepository<Application, Long> {
}
