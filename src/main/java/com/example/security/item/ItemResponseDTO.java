package com.example.security.item;

public record ItemResponseDTO(long id, String name, String description, int quantity) {
    public ItemResponseDTO(Item item ) {
        this(item.getId(), item.getName(), item.getDescription(), item.getQuantity());
    }
}
