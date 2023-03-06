package com.test.jacocotest;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@SpringBootTest
public class jacocoTest extends AbstractTestNGSpringContextTests {
    @Resource
    FuctionService service;

    @Test
    public void test1() {
        service.methodC();
    }
}
