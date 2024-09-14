package com.kubernetes_example.api.presentation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubernetes_example.api.persistence.entity.UserEntity;
import com.kubernetes_example.api.service.IUserService;


@RestController
@RequestMapping("/api")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    /* http://localhost:8080/api/users */
    @GetMapping("/users")
    public List<UserEntity> getAllUser() {
        return userService.getUsers();
    }
}
