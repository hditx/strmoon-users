package com.stratosphere.strmoonusers.application.usecases;

import com.stratosphere.strmoonusers.application.port.UserPort;
import com.stratosphere.strmoonusers.domain.entities.User;
import com.stratosphere.strmoonusers.domain.entities.UserFilter;
import com.stratosphere.strmoonusers.domain.exceptions.UserNotFoundException;
import com.stratosphere.strmoonusers.domain.usecases.UsersUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UsersUseCaseImpl implements UsersUseCase {
    private final UserPort userPort;
    @Override
    public User invoke(UserFilter filter) throws UserNotFoundException {
        var user = userPort.findUserByPassword(filter);
        if (user.isEmpty()) {
            throw new UserNotFoundException("User invalid");
        }
        return user.get();
    }
}
