package com.micro.validate;

import com.micro.exception.ValidationException;

public interface ValidationHandler<T> {
    void validate(T data) throws ValidationException;
}
