package com.example.demo;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCrmApplicationTests {

    @Test
    public void contextLoads() {

        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        for (int i = 0; i < al.size(); i++) {
            al.add(1);

        }

    }

}
