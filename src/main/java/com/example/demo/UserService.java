package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        if (userRepository.findAll().isEmpty()) {
            userRepository.save(new User(null, "Evgeny", "ttt@mail.com"));
            userRepository.save(new User(null, "Sveta", "uut@mail.com"));
            userRepository.save(new User(null, "Jeka", "eee@mail.com"));
        }
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id);
    }


}
