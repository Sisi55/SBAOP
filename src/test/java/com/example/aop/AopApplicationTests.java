package com.example.aop;

import com.example.aop.service.BoardService;
import com.example.aop.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class AopApplicationTests {

    @Autowired
    private BoardService boardService;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    public void findBoards() throws Exception {
        assertThat(boardService.getBoards().size()).isEqualTo(100);
    }

    @Test
    public void findUsers() throws Exception{
        assertThat(userService.getUsers().size()).isEqualTo(100L);
    }

}
