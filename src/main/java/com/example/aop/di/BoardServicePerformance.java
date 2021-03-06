package com.example.aop.di;

import com.example.aop.domain.Board;
import com.example.aop.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class BoardServicePerformance implements BoardService {

    @Autowired
    @Qualifier("boardServiceImpl") // 주입받는건가?
    private BoardService boardService;

    @Override
    public List<Board> getBoards(){
        long start = before();
        List<Board> boards = boardService.getBoards();
        after(start);

        return boards;
    }

    private long before(){
        return System.currentTimeMillis();
    }

    private void after(long start){
        long end = System.currentTimeMillis();
        System.out.println("수행 시간 : "+(end-start));
    }
}
