package com.example.aop.di;

import com.example.aop.domain.Board;
import com.example.aop.domain.BoardRepository;
import com.example.aop.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository repository;

    @Override
    public List<Board> getBoards(){
        return repository.findAll();
    }
}
