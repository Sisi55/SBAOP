package com.example.aop.service;

import com.example.aop.aspect.SuperPerformance;
import com.example.aop.aspect.UserPerformance;
import com.example.aop.domain.User;
import com.example.aop.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends SuperPerformance<User> {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
