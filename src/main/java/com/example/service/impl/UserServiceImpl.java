package com.example.service.impl;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

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
    //4th Dnyaneshwar 28 I am software Dev.
    @Override
    public User getSingleUser(Long userId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Resource not found on server!!" + userId));

        return user;

    }

      /*  Optional<User> user = userRepository.findById(userId);

        if (user.isPresent()) {
            return user.get();
        } else {
            throw new NullPointerException("Resource not found on server!!" + userId);
        }


    }*/

    @Override
    public List<User> getAllUsers() {

        List<User> allUsers = userRepository.findAll();

        return allUsers;
    }
    //4th Dnyaneshwar 28 I am software Dev.
    @Override
    public void deleteUser(Long userId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Resource not found on server!!" + userId));
        userRepository.delete(user);

    }
}
