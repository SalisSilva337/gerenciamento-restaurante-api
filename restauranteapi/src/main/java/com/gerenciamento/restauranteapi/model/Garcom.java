package com.gerenciamento.restauranteapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Garcom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_garcom")
    Long id;

    String nome_garcom;
    String email_garcom;
    boolean esta_disponivel;
    public Garcom(Long id_garcom, String nome_garcom, String email_garcom, boolean esta_disponivel) {
        this.id = id_garcom;
        this.nome_garcom = nome_garcom;
        this.email_garcom = email_garcom;
        this.esta_disponivel = esta_disponivel;
    }
    
    public Garcom() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id_garcom) {
        this.id = id_garcom;
    }
    public String getNome_garcom() {
        return nome_garcom;
    }
    public void setNome_garcom(String nome_garcom) {
        this.nome_garcom = nome_garcom;
    }
    public String getEmail_garcom() {
        return email_garcom;
    }
    public void setEmail_garcom(String email_garcom) {
        this.email_garcom = email_garcom;
    }
    public boolean isEsta_disponivel() {
        return esta_disponivel;
    }
    public void setEsta_disponivel(boolean esta_disponivel) {
        this.esta_disponivel = esta_disponivel;
    }

    
    
}
