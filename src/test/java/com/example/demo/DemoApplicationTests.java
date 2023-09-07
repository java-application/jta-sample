package com.example.demo;

import com.example.demo.service.FooService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private FooService fooService;

    @Test
    public void contextLoads() {
        log.debug("test: {}", "=========================================================");
        fooService.bar("test");
    }

}
