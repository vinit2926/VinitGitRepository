package com.micro.validate;

import com.micro.entities.User;
import com.micro.exception.ValidationException;

public class GenderValidator implements ValidationHandler<User> {

    @Override
    public void validate(User data) throws ValidationException {
        if (!data.getGender().equalsIgnoreCase("male") && !data.getGender().equalsIgnoreCase("female")) {
            throw new ValidationException("Gender must be male or female only");
        }
    }
}
