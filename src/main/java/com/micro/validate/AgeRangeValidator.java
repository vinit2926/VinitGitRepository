package com.micro.validate;

import com.micro.entities.User;
import com.micro.exception.ValidationException;

public class AgeRangeValidator implements ValidationHandler<User> {
    @Override
    public void validate(User data) throws ValidationException {
        if (data.getAge() > 65) {
            throw new ValidationException("Age must not exceed 65.");
        }
    }
}
