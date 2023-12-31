package com.stratosphere.strmoonusers.infrastructure.controllers;

import com.stratosphere.strmoonusers.domain.entities.UserFilter;
import com.stratosphere.strmoonusers.domain.exceptions.UserNotFoundException;
import com.stratosphere.strmoonusers.domain.usecases.UsersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersUseCase usersUseCase;

    @GetMapping("/{password}")
    public ResponseEntity<?> invoke(@RequestParam("password") String password) throws UserNotFoundException {
        return ResponseEntity.ok(usersUseCase.invoke(
                UserFilter.builder().password(password).build()
        ));
    }
}
