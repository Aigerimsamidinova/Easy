package com.example.EasyFinallyProgect.repository;

import com.example.EasyFinallyProgect.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRep  extends JpaRepository<Item, Long> {
}
