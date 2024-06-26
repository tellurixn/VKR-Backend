package com.example.demo.repositories;


import com.example.demo.models.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Override
    void deleteById(Long aLong);
}