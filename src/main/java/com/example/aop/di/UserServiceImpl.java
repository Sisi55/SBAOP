package com.example.aop.di;

import com.example.aop.domain.User;
import com.example.aop.domain.UserRepository;
import com.example.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getUsers(){
        return repository.findAll();
    }

    @Override
    public void update(User user) throws Exception {
        repository.save(user);
    }
}
