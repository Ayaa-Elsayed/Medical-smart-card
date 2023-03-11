package com.ayaagroup.demo.repository;

import com.ayaagroup.demo.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String username);

    boolean existsByUserName(String username);
}
