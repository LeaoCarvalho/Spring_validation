package com.example.security.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

//todo: maybe change the key to string
public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByUsername(String username);
}
