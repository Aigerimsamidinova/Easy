package com.example.EasyFinallyProgect.repository;

import com.example.EasyFinallyProgect.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRep  extends JpaRepository<Comment, Long> {
}
