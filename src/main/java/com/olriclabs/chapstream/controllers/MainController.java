package com.olriclabs.chapstream.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Authentication auth){
        if (auth == null) {
            return "landing";
        }
        return "index";
    }
}
