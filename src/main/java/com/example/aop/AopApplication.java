package com.example.aop;

import com.example.aop.domain.Board;
import com.example.aop.domain.BoardRepository;
import com.example.aop.domain.User;
import com.example.aop.domain.UserRepository;
import com.example.aop.service.BoardService;
import com.example.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class AopApplication implements CommandLineRunner {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        for(int i=1;i<=100;i++){
            boardRepository.save(new Board(i+"번째 게시글 제목", i+"번째 게시글"));
            userRepository.save(new User(i+"@email.com", i+"번째 사용자"));
        }
    }

    @GetMapping("/boards")
    public List<Board> getBoards(){
        return boardService.getBoards();//.getDataAll();
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getDataAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

}
