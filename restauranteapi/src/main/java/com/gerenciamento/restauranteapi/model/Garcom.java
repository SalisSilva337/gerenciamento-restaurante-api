package com.gerenciamento.restauranteapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Garcom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_garcom;
    
    String nome_garcom;
    String email_garcom;
    boolean esta_disponivel;

    
    public Garcom(Long id, String nome, String email, boolean estaDisponivel) {
        this.id_garcom = id;
        this.nome_garcom = nome;
        this.email_garcom = email;
        this.esta_disponivel = estaDisponivel;
    }
    public Long getId_garcom() {
        return id_garcom;
    }
    public void setId_garcom(Long id) {
        this.id_garcom = id;
    }
    public String getNome_garcom() {
        return nome_garcom;
    }
    public void setNome_garcom(String nome) {
        this.nome_garcom = nome;
    }
    public String getEmail_garcom() {
        return email_garcom;
    }
    public void setEmail_garcom(String email) {
        this.email_garcom = email;
    }
    public boolean getEsta_disponivel() {
        return esta_disponivel;
    }
    public void setEsta_disponivel(Boolean estaDisponivel) {
        this.esta_disponivel = estaDisponivel;
    }

}
