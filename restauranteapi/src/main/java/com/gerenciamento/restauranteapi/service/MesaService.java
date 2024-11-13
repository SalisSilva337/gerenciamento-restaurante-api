package com.example.mesa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mesa.model.Mesa;
import com.example.mesa.repository.MesaRepository;

@Service
public class MesaService {
    private final MesaRepository mesaRepository;

    public MesaService(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    public void adicionarMesa (Mesa request){
        mesaRepository.save(request);
    }

    public List<Mesa> listarTodasAsMesas(){
        return mesaRepository.findAll();
    }

    public void atualizarMesa(Long id, Mesa update){
        Mesa mesa = mesaRepository.findById(id)
            .orElseThrow(
                            () -> new RuntimeException("Mesa não encontrada.")
                        );
        mesa.setNumeroUnico(update.getNumeroUnico());
        mesa.setDisponibilidade(update.getDisponibilidade());
        mesa.setCapacidadeMaxima(update.getCapacidadeMaxima());
        mesa.setPedidosPendentes(update.getPedidosPendentes());
        mesaRepository.save(mesa);
    }

    public void deletarMesa(Long id){
        mesaRepository.deleteById(id);
    }

}
