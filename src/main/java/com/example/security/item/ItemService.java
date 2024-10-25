package com.example.security.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void addItem(ItemRequestDTO data) {
        Item item = new
                Item(data);
        itemRepository.save(item);
    }

    public List<ItemResponseDTO> getAll(){
        List<ItemResponseDTO> items = itemRepository.findAll().stream().map(ItemResponseDTO::new).toList();
        return items;
    }

}
