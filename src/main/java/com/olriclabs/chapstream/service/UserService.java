package com.olriclabs.chapstream.service;

import com.olriclabs.chapstream.controllers.dto.UserRegistrationDto;
import com.olriclabs.chapstream.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    User findByUsername(String username);

    User save(UserRegistrationDto registrationDto);
}
