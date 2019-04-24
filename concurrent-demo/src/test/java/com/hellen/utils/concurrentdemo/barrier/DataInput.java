package com.hellen.utils.concurrentdemo.barrier;

import java.util.concurrent.CyclicBarrier;

public class DataInput implements Runnable {
    private CyclicBarrier barrier;

    public DataInput(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("开始录入数据");
            Thread.sleep(1000);
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("所有数据录入完成");
    }

    public static void main(String[] args) {
        int n = 20 ;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(n);
        for (int i = 0; i < n; i++) {
            new Thread(new DataInput(cyclicBarrier)).start();
        }
    }
}
