package com.example.security.user;

public record RegisterDTO(String username, String password, UserRole role) {
}
