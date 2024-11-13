package com.example.mesa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mesa.model.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long>{
    Optional<Mesa> findByNumeroUnico(Long numero);
}