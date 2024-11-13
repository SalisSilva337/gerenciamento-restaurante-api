package com.example.mesa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mesa.model.Mesa;
import com.example.mesa.service.MesaService;

@RestController
@RequestMapping("/api/v1/gerente/mesa")
public class MesaController {
    private MesaService mesaService;
    
    public MesaController(MesaService mesaService) {
        this.mesaService = mesaService;
    }

    @PostMapping("/addmesa")
    public void adicionarMesa(@RequestBody Mesa request){
        mesaService.adicionarMesa(request);
    }

    @GetMapping("/all")
    public List<Mesa> listarMesas(){
        List<Mesa> mesas = mesaService.listarTodasAsMesas();
        return mesas;
    }

    @PutMapping("/{id}")
    public void atualizarMesa(@RequestBody Mesa update, @PathVariable Long id){
        mesaService.atualizarMesa(id, update);
    }

    @DeleteMapping("/{id}")
    public void deletarMesa(@PathVariable Long id){
        mesaService.deletarMesa(id);
    }
}
