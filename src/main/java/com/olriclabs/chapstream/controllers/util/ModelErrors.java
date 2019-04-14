package com.olriclabs.chapstream.controllers.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.FieldError;

@Getter
@Setter
public class ModelErrors {
    private String status = "failed";
    private String message;

    private ArrayList<HashMap<String, String>> errors = new ArrayList<HashMap<String, String>>();

    public ModelErrors(List<FieldError> allErrors, String message) {
        this.message = message;
        for(FieldError e : allErrors) {
            HashMap<String, String> fieldError = new HashMap<>();
            fieldError.put(e.getField(), e.getDefaultMessage());
            this.errors.add(fieldError);
        }
    }
}