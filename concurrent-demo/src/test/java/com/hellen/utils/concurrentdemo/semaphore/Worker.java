package com.hellen.utils.concurrentdemo.semaphore;

import java.util.concurrent.Semaphore;

public class Worker extends Thread {
    private int num;
    private Semaphore semaphore;
    Worker(int num, Semaphore semaphore){
        this.num = num;
        this.semaphore = semaphore;
    }
    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("第 "+ num + "个工人，在工作");
            Thread.sleep(1000);
            semaphore.release();
            System.out.println("第 "+ num + "个工人，下班");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 30; i++) {
            new Worker(i,semaphore).start();
        }

    }
}
