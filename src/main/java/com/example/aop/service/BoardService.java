package com.example.aop.service;

import com.example.aop.domain.Board;
import com.example.aop.domain.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository repository;

    public List<Board> getBoards(){
        return repository.findAll();
    }
}
