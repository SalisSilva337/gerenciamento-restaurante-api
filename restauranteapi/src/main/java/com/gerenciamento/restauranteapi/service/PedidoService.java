package com.gerenciamento.restauranteapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gerenciamento.restauranteapi.model.Pedido;
import com.gerenciamento.restauranteapi.repository.PedidoRepository;



@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> getAllPedidos(){
        return pedidoRepository.findAll();
    }

    public void createPedido(Pedido pedido){
        if(pedido.getStatus_pedido() == null || pedido.getStatus_pedido().isBlank()) throw new RuntimeException("O nome do Item deve ser diferente de vazio");
        if(pedido.getHora_pedido() == null || pedido.getHora_pedido() <= 0) throw new RuntimeException("Preço inválido");
        
        pedidoRepository.save(pedido);
    }

    public Pedido getPedidoById(Long id){
        if(id == null) throw new RuntimeException("id não válido");
        return pedidoRepository.findById(id)
                .orElseThrow(
                    () -> new RuntimeException("Item Não encontrado")
                );
    }

    public void updatePedidoById(Long id, Pedido update){
        if(update.getStatus_pedido() == null || update.getStatus_pedido().isBlank()) throw new RuntimeException("O nome do Item deve ser diferente de vazio");
        if(update.getHora_pedido() == null || update.getHora_pedido() <= 0) throw new RuntimeException("Preço inválido");
        Pedido pedido = pedidoRepository.findById(id)
            .orElseThrow(
                () -> new RuntimeException("Item Não encontrado")
            );
        pedido.setStatus_pedido(update.getStatus_pedido());
        pedido.setHora_pedido(update.getHora_pedido());
        pedido.setData_pedido(update.getData_pedido());
        pedido.setSubTotal_pedido(update.getSubTotal_pedido());

        pedidoRepository.save(pedido); 
    }

    public void deletePedidoById(Long id){
        if(id == null) throw new RuntimeException("id não válido");
        pedidoRepository.deleteById(id);
    }
}
