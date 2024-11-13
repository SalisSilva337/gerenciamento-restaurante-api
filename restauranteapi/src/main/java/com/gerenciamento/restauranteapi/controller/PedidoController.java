package com.gerenciamento.restauranteapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciamento.restauranteapi.model.Pedido;
import com.gerenciamento.restauranteapi.service.PedidoService;

@RestController
@RequestMapping("pedido/v1")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<Pedido> getAllPedidos(){
       return pedidoService.getAllPedidos(); 
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable Long id){
        return pedidoService.getPedidoById(id);
    }


    @PostMapping
    public void savePedido(@RequestBody Pedido request){
        pedidoService.createPedido(request);
    }

    @PutMapping("/{id}")
    public void updatePedido(@PathVariable Long id,@RequestBody Pedido requestUpdate){
        pedidoService.updatePedidoById(id,requestUpdate);
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id){
        pedidoService.deletePedidoById(id);
    }
}
