package com.hellen.utils.concurrentdemo.threadpool;

import com.hellen.utils.concurrentdemo.ConcurrentDemoApplicationTests;
import com.hellen.utils.concurrentdemo.multithread.ThreadState;
import org.junit.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;

public class ExecutorsTest extends ConcurrentDemoApplicationTests {
    @Resource
    private ThreadPoolTaskExecutor taskExecutor;
    @Test
    public void test1(){
        taskExecutor.setCorePoolSize(2);
        taskExecutor.setMaxPoolSize(3);
        taskExecutor.setQueueCapacity(10);
        for (int i = 0; i < 100; i++) {
            taskExecutor.execute(new ThreadState());
            sleep(1);
            System.out.println("当前线程数量："+taskExecutor.getActiveCount());
            System.out.println("当前等待队列数量："+taskExecutor.getThreadPoolExecutor().getQueue().size());
        }
    }

    public static void sleep(int second){
        try {
            Thread.sleep(second * 1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
