package com.poc.ticketingplatform.service;

import com.poc.ticketingplatform.model.User;
import com.poc.ticketingplatform.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }
}
