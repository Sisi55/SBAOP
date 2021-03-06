package com.example.aop.service;

import com.example.aop.aspect.BoardPerformance;
import com.example.aop.aspect.SuperPerformance;
import com.example.aop.domain.Board;
import com.example.aop.domain.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BoardService {
    List<Board> getBoards();
}