package com.example.security.controllers;

import com.example.security.item.ItemRequestDTO;
import com.example.security.item.ItemResponseDTO;
import com.example.security.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping
    public List<ItemResponseDTO> getAll(){

        return service.getAll();
    }

    @PostMapping
    public void makeNewItem(@RequestBody ItemRequestDTO data){
        service.addItem(data);
    }
}
