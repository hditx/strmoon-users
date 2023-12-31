package com.stratosphere.strmoonusers;

import com.stratosphere.strmoonusers.application.usecases.UsersUseCaseImpl;
import com.stratosphere.strmoonusers.application.port.UserPort;
import com.stratosphere.strmoonusers.domain.usecases.UsersUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
    @Bean
    public UsersUseCase getUsersUseCase(final UserPort userPort) {
        return new UsersUseCaseImpl(userPort);
    }
}
