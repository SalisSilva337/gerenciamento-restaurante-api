package com.gerenciamento.restauranteapi.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    
    Long id;
    Date data_pedido;
    Double hora_pedido;
    String status_pedido;
    Double subTotal_pedido;
    
    public Pedido() {
    }
    public Pedido(Long id, Date data_pedido, Double hora_pedido, String status_pedido, Double subTotal_pedido) {
        this.id = id;
        this.data_pedido = data_pedido;
        this.hora_pedido = hora_pedido;
        this.status_pedido = status_pedido;
        this.subTotal_pedido = subTotal_pedido;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getData_pedido() {
        return data_pedido;
    }
    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }
    public Double getHora_pedido() {
        return hora_pedido;
    }
    public void setHora_pedido(Double hora_pedido) {
        this.hora_pedido = hora_pedido;
    }
    public String getStatus_pedido() {
        return status_pedido;
    }
    public void setStatus_pedido(String status_pedido) {
        this.status_pedido = status_pedido;
    }
    public Double getSubTotal_pedido() {
        return subTotal_pedido;
    }
    public void setSubTotal_pedido(Double subTotal_pedido) {
        this.subTotal_pedido = subTotal_pedido;
    }
    
    
 }
