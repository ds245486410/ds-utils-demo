package com.hellen.utils.concurrentdemo.multithread;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        BlockingQueue<Runnable> worque = new ArrayBlockingQueue<>(5);
        ExecutorService executorService = new ThreadPoolExecutor(3,10,60l, TimeUnit.SECONDS,worque);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new ThreadState());
            sleep(1);
            System.out.println("当前线程数量："+((ThreadPoolExecutor) executorService).getActiveCount());
            System.out.println("当前等待队列数量："+((ThreadPoolExecutor) executorService).getQueue().size());
        }
        for (int i = 0; i <100; i++) {
            sleep(1);
            System.out.println(i+"当前核心线程"+((ThreadPoolExecutor) executorService).getCorePoolSize());
            System.out.println(i+"当前线程数量："+((ThreadPoolExecutor) executorService).getPoolSize());
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
