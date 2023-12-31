package com.stratosphere.strmoonusers.infrastructure.adapters;

import com.stratosphere.strmoonusers.application.port.UserPort;
import com.stratosphere.strmoonusers.domain.entities.User;
import com.stratosphere.strmoonusers.domain.entities.UserFilter;
import com.stratosphere.strmoonusers.infrastructure.mappers.UserMapper;
import com.stratosphere.strmoonusers.infrastructure.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class UserPortImpl implements UserPort {
    private final UsersRepository usersRepository;
    private final UserMapper userMapper;

    @Override
    public Optional<User> findUserByPassword(UserFilter userFilter) {
        return Optional.empty();
    }
}
