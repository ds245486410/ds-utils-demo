package com.hellen.utils.concurrentdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@ImportResource(locations = "/threadpool.xml")
@Slf4j
public class ConcurrentDemoApplicationTests {
    @Resource
    private ThreadPoolTaskExecutor taskExecutor;

    @Test
    public void contextLoads() {
        taskExecutor.submit(new Runnable() {
            @Override
            public void run() {
               log.info("打印下日志 ： [{}]");
            }
        });
    }

}
