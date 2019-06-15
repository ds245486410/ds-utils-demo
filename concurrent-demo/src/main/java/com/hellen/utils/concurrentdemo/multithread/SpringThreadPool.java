package com.hellen.utils.concurrentdemo.multithread;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ExecutorService;

public class SpringThreadPool {
    public static void main(String[] args) {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();

        threadPoolTaskExecutor.execute(() ->{
            System.out.println(Thread.currentThread().getId());
        });
    }
}
