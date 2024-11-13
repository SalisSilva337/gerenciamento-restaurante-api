package com.example.mesa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "mesadb")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numeroUnico;
    private Long capacidadeMaxima;
    private String disponibilidade = "livre";
    private Long pedidosPendentes;

    public Mesa() {
    }

    public Mesa(Long numeroUnico, Long capacidadeMaxima) {
        this.numeroUnico = numeroUnico;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Long getId() {
        return id;
    }

    public Long getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(Long numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public Long getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(Long capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Long getPedidosPendentes() {
        return pedidosPendentes;
    }

    public void setPedidosPendentes(Long pedidosPendentes) {
        this.pedidosPendentes = pedidosPendentes;
    }

}
