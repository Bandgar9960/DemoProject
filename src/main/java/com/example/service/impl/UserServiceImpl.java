package com.example.service.impl;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserServiceI {


    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // IOC - spring bean life cycle, DI injection

    //DI - dependency Injection - setter, constructor, feild dependency injection


    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, Long userId) {
        return null;
    }

    @Override
    public User getSingleUser(Long userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
