package com.example.spring_boot_jwt_ttp.service;

import com.example.spring_boot_jwt_ttp.Repository.UserRepository;
import com.example.spring_boot_jwt_ttp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserRepository userrepository;

    @Override
    public User createUser(User user) {
        userrepository.save(user);
        return user;
    }
}
