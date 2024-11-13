package com.gerenciamento.restauranteapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.gerenciamento.restauranteapi.model.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}

