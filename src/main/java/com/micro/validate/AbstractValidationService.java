package com.micro.validate;

import java.util.ArrayList;
import java.util.List;

import com.micro.exception.ValidationException;

public abstract class AbstractValidationService <T> {

    protected final List<ValidationHandler<T>> chain = new ArrayList<ValidationHandler<T>>();
    public void validate(T dto) throws ValidationException {

        for (ValidationHandler<T> handler : chain) {
            handler.validate(dto);
        }
     }
}
