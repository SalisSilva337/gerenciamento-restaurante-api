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

import com.gerenciamento.restauranteapi.model.Garcom;
import com.gerenciamento.restauranteapi.service.GarcomService;

@RestController
@RequestMapping("garcom/v1")
public class GarcomController {

    private final GarcomService garcomService;

    public GarcomController(GarcomService garcomService){
        this.garcomService = garcomService;
    }

    @GetMapping
    public List<Garcom> getAllGarcoms(){
       return garcomService.getAllGarcoms(); 
    }

    @GetMapping("/{id}")
    public Garcom getGarcomById(@PathVariable Long id){
        return garcomService.getGarcomById(id);
    }


    @PostMapping
    public void saveGarcom(@RequestBody Garcom request){
        garcomService.createGarcom(request);
    }

    @PutMapping("/{id}")
    public void updateGarcom(@PathVariable Long id,@RequestBody Garcom requestUpdate){
        garcomService.updateGarcomById(id,requestUpdate);
    }

    @DeleteMapping("/{id}")
    public void deleteGarcom(@PathVariable Long id){
        garcomService.deleteGarcomById(id);
    }
}

