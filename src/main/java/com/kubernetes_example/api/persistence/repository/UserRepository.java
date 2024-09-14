package com.kubernetes_example.api.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kubernetes_example.api.persistence.entity.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String>{
    
}
