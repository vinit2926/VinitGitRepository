package com.micro.validate;

import org.springframework.stereotype.Service;

import com.micro.entities.User;

@Service
public class ValidationService extends AbstractValidationService <User>{
    public ValidationService() {
        chain.add(new NameValidator());
        chain.add(new AgeRangeValidator());
        chain.add(new GenderValidator());
    }
}
