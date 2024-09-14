package com.kubernetes_example.api.service;

import java.util.List;

import com.kubernetes_example.api.persistence.entity.UserEntity;

public interface IUserService {
    List<UserEntity> getUsers();
}
