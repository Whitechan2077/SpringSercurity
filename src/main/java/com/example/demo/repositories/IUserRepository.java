package com.example.demo.repositories;

import com.example.demo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IUserRepository extends JpaRepository<Users,Long> {
    Users findByUsername(String username);
}
