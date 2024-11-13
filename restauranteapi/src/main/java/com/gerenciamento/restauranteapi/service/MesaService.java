package com.gerenciamento.restauranteapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gerenciamento.restauranteapi.model.Mesa;
import com.gerenciamento.restauranteapi.repository.MesaRepository;

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
