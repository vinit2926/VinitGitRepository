package com.micro.validate;

import com.micro.entities.User;
import com.micro.exception.ValidationException;

public class NameValidator implements ValidationHandler<User> {
    @Override
    public void validate(User data) throws ValidationException {
        if (data.getUsername() == null || data.getUsername().trim().isEmpty()) {
            throw new ValidationException("Name must not be null or empty.");
        }
        if (data.getUsername().length() < 3) {
            throw new ValidationException("Name must be at least 3 characters long.");
        }
    }
}
