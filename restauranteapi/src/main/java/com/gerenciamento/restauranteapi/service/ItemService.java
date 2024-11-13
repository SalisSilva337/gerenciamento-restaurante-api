package com.gerenciamento.restauranteapi.service;

import java.util.List;

import com.gerenciamento.restauranteapi.model.Item;


import com.gerenciamento.restauranteapi.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public void createItem(Item request){
        if(request.getNome_item() == null || request.getNome_item().isBlank()) throw new RuntimeException("O nome do Item deve ser diferente de vazio");
        if(request.getPreco_item() == null || request.getPreco_item() <= 0) throw new RuntimeException("Preço inválido");
        
        itemRepository.save(request);
    }

    public Item getItemById(Long id){
        if(id == null) throw new RuntimeException("id não válido");
        return itemRepository.findById(id)
                .orElseThrow(
                    () -> new RuntimeException("Item Não encontrado")
                );
    }

    public void updateItemById(Long id, Item update){
        if(update.getNome_item() == null || update.getNome_item().isBlank()) throw new RuntimeException("O nome do Item deve ser diferente de vazio");
        if(update.getPreco_item() == null || update.getPreco_item() <= 0) throw new RuntimeException("Preço inválido");
        Item item = itemRepository.findById(id)
            .orElseThrow(
                () -> new RuntimeException("Item Não encontrado")
            );
        item.setNome_item(update.getNome_item());
        item.setQuantidade_item(update.getQuantidade_item());
        item.setPreco_item(update.getPreco_item());
        itemRepository.save(item); 
    }

    public void deleteItemById(Long id){
        if(id == null) throw new RuntimeException("id não válido");
        itemRepository.deleteById(id);
    }
}
