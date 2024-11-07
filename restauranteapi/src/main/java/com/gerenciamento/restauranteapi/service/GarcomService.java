package com.gerenciamento.restauranteapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gerenciamento.restauranteapi.model.Garcom;
import com.gerenciamento.restauranteapi.repo.GarcomRepository;

@Service
public class GarcomService {
    private final GarcomRepository garcomRepository;

    public GarcomService(GarcomRepository garcomRepository) {
        this.garcomRepository = garcomRepository;
    }

    public List<Garcom> getAllGarcoms(){
        return garcomRepository.findAll();
    }

    public void createGarcom(Garcom request){
        if(request.getNome_garcom() == null || request.getNome_garcom().isBlank()) throw new RuntimeException("O nome do Garcom deve ser diferente de vazio");
        if(request.getEmail_garcom() == null || request.getEmail_garcom().isBlank()) throw new RuntimeException("Email inválido");
        
        garcomRepository.save(request);
    }

    public Garcom getGarcomById(Long id){
        if(id == null) throw new RuntimeException("id não válido");
        return garcomRepository.findById(id)
                .orElseThrow(
                    () -> new RuntimeException("Garcom Não encontrado")
                );
    }

    public void updateGarcomById(Long id, Garcom update){
        if(update.getNome_garcom() == null || update.getNome_garcom().isBlank()) throw new RuntimeException("O nome do Garcom deve ser diferente de vazio");
        if(update.getEmail_garcom() == null || update.getEmail_garcom().isBlank()) throw new RuntimeException("Email inválido");
        Garcom garcom = garcomRepository.findById(id)
            .orElseThrow(
                () -> new RuntimeException("Garcom Não encontrado")
            );
            garcom.setNome_garcom(update.getNome_garcom());
            garcom.setEmail_garcom(update.getEmail_garcom());
        garcomRepository.save(garcom); 
    }

    public void deleteGarcomById(Long id){
        if(id == null) throw new RuntimeException("id não válido");
        garcomRepository.deleteById(id);
    }

   
}
