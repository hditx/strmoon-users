package com.stratosphere.strmoonusers.application.port;

import com.stratosphere.strmoonusers.domain.entities.User;
import com.stratosphere.strmoonusers.domain.entities.UserFilter;

import java.util.Optional;

public interface UserPort {
    Optional<User> findUserByPassword(UserFilter userFilter);
}
