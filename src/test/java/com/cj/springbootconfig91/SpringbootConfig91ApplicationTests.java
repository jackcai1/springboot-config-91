package com.cj.springbootconfig91;

import com.cj.springbootconfig91.bean.Person;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.w3c.dom.ls.LSOutput;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootConfig91ApplicationTests {
    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }



}
