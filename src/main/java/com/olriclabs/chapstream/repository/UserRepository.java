package com.olriclabs.chapstream.repository;

import com.olriclabs.chapstream.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);

    User findByUsername(String username);
}
