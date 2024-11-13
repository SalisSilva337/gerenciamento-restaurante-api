package com.gerenciamento.restauranteapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item")
    Long id;

    String nome_item;
    Integer quantidade_item;
    Double preco_item;
    public Item(Long id, String nome, Integer quantidade, Double preco) {
        this.id = id;
        this.nome_item = nome;
        this.quantidade_item = quantidade;
        this.preco_item = preco;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome_item() {
        return nome_item;
    }
    public Item() {
    }

    public void setNome_item(String nome) {
        this.nome_item = nome;
    }
    public Integer getQuantidade_item() {
        return quantidade_item;
    }
    public void setQuantidade_item(Integer quantidade) {
        this.quantidade_item = quantidade;
    }
    public Double getPreco_item() {
        return preco_item;
    }
    public void setPreco_item(Double preco) {
        this.preco_item = preco;
    }
 }
