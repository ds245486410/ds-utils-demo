package com.hellen.utils.concurrentdemo.coundown;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        for (int i = 0; i < 12; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("我就试试");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            }).start();
        }
        System.out.println("测试使用");
        countDownLatch.await();
        System.out.println("已经经过10");
    }
}
