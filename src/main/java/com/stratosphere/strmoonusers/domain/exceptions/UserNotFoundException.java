package com.stratosphere.strmoonusers.domain.exceptions;

import com.stratosphere.strmoonusers.domain.entities.UserFilter;
import lombok.Getter;

@Getter
public class UserNotFoundException extends Exception {
    private String message;

    public UserNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
