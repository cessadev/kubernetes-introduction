package com.kubernetes_example.api.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kubernetes_example.api.persistence.entity.UserEntity;
import com.kubernetes_example.api.persistence.repository.UserRepository;
import com.kubernetes_example.api.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
    
}
