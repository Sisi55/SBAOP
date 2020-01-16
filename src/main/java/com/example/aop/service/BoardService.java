package com.example.aop.service;

import com.example.aop.aspect.BoardPerformance;
import com.example.aop.domain.Board;
import com.example.aop.domain.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService extends BoardPerformance {

    @Autowired
    private BoardRepository repository;

//    public List<Board> getBoards(){
//        long start = System.currentTimeMillis();
//        List<Board> boards = repository.findAll();
//        long end = System.currentTimeMillis();
//
//        System.out.println("수행 시간 : "+(end-start));
//
//        return boards;
//    }

    @Override
    public List<Board> findAll(){
        return repository.findAll();
    }
}
