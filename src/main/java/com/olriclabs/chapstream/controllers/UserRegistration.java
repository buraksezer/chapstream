package com.olriclabs.chapstream.controllers;

import com.olriclabs.chapstream.controllers.dto.UserRegistrationDto;
import com.olriclabs.chapstream.controllers.util.ModelErrors;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/registration")
public class UserRegistration {
    @PostMapping
    public ResponseEntity registration(@ModelAttribute("user") @Valid UserRegistrationDto dto,
                                        BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(
                    new ModelErrors(result.getFieldErrors(),"registration form could not be validated")
            );
        }
        return ResponseEntity.ok().body("user registered successfully");
    }
}
