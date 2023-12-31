package com.stratosphere.strmoonusers.domain.usecases;

import com.stratosphere.strmoonusers.domain.entities.User;
import com.stratosphere.strmoonusers.domain.entities.UserFilter;
import com.stratosphere.strmoonusers.domain.exceptions.UserNotFoundException;

public interface UsersUseCase {
    User invoke(UserFilter filter) throws UserNotFoundException;
}
