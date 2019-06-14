package com.hellen.utils.concurrentdemo.multithread;

public class ThreadState implements Runnable {

    @Override
    public void run() {
        //System.out.println("当前线程id："+Thread.currentThread().getId());
        try {
            Thread.sleep(6000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
