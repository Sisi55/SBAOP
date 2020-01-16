package com.example.aop.service;

import com.example.aop.domain.User;
import com.example.aop.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

//    @Override
    public List<User> getUsers(){
        return repository.findAll();
    }
}
