package com.kubernetes_example.api.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kubernetes_example.api.persistence.entity.UserEntity;
import com.kubernetes_example.api.persistence.repository.UserRepository;

@Configuration
public class DataLoaderConfig {
    
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            // Eliminar todos los usuarios existentes
            userRepository.deleteAll();

            // Crear nuevos usuarios
            userRepository.save(new UserEntity(null, "John Doe", "john.doe@example.com", "555-1234"));
            userRepository.save(new UserEntity(null, "Jane Smith", "jane.smith@example.com", "555-5678"));
            userRepository.save(new UserEntity(null, "Alice Johnson", "alice.johnson@example.com", "555-9876"));

            System.out.println("Datos iniciales cargados en la colección 'users'");
        };
    }
}
