package com.xingrui.springboot;

import com.xingrui.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot的单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
    @Autowired
    private Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
