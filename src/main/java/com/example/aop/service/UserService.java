package com.example.aop.service;

import com.example.aop.aspect.UserPerformance;
import com.example.aop.domain.User;
import com.example.aop.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends UserPerformance {

    @Autowired
    private UserRepository repository;

//    @Override
//    public List<User> getUsers(){
//        long start = System.currentTimeMillis();
//        List<User> users = repository.findAll();
//        long end = System.currentTimeMillis();
//
//        System.out.println("수행 시간 : "+(end-start));
//
//        return users;
//    }

    @Override
    public List<User> findAll(){
        return repository.findAll();
    }
}
