package com.gerenciamento.restauranteapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciamento.restauranteapi.model.Garcom;

@Repository
public interface GarcomRepository extends JpaRepository<Garcom,Long> {
    
}
