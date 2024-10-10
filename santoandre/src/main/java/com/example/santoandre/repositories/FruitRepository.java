package com.example.santoandre.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.santoandre.models.FruitModel;

public interface FruitRepository extends JpaRepository <FruitModel, Long>{

}
