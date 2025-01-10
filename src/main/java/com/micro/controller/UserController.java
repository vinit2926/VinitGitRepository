package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.entities.User;
import com.micro.exception.ValidationException;
import com.micro.validate.ValidationService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ValidationService validationService;


    @GetMapping("/get")
    public String helloApi() {
        return "Hello From This Side..";
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody User user) {
        try {

            validationService.validate(user);
            return ResponseEntity.ok("Validation passed and processing successful.");
        } catch (ValidationException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
