package com.example.service.impl;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserServiceI {


    @Autowired
    private UserRepository userRepository;

   // IOC - spring bean life cycle, DI injection

    //DI - dependency Injection - setter, constructor, feild dependency injection


    @Override
    public User createUser(User user) {

        User savedUser = userRepository.save(user);

        return savedUser;
    }
    //4 th  Dnyaneshwar, 28 , Latur
    //      Shivaji  27  Pune
    @Override
    public User updateUser(User user, Long userId) {

        User user1 = userRepository.findById(userId).get();

        user1.setUserName(user.getUserName());
        user1.setUserAge(user.getUserAge());
        user1.setAbout(user.getAbout());

        User updatedUser = userRepository.save(user1);

        return updatedUser;
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
